package JAVA8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Entry {
    private String msg;
    private String work;
    private String code;

    public Entry(String msg, String work, String code) {
        this.msg = msg;
        this.work = work;
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public String getWork() {
        return work;
    }

    public String getCode() {
        return code;
    }
}

public class StreamApi {
    public static void main(String[] args) {
        List<Entry> logs = Arrays.asList(
            new Entry("syntax error", "Error", "Np1001"),
            new Entry("Null pointer exception", "ERROR", "NPE1001"),
            new Entry("syntax error", "Error", "Np1001"),
            new Entry("User login failed", "WARN", "AUTH1004"),
            new Entry("syntax error", "Error", "Np1001")
        );

        Map<String, List<String>> errorCodeByWork = logs.stream()
            .filter(log -> "Error".equalsIgnoreCase(log.getWork()) || "Critical".equalsIgnoreCase(log.getWork()))
            .collect(Collectors.groupingBy(
                Entry::getWork,
                Collectors.mapping(Entry::getCode, Collectors.toList())
            ));

       
        errorCodeByWork.forEach((work, codes) -> {
            System.out.println("Work: " + work);
            System.out.println("Error Codes: " + codes);
            System.out.println("Count: " + codes.size());
            System.out.println();
        });
    }
}

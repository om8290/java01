package JAVA8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Comparator;

class Test {
    private String name;
    private String status;
    private long executionTime;

    Test(String name, String status, long executionTime) {
        this.name = name;
        this.status = status;
        this.executionTime = executionTime;
    }

    public void display() {
        System.out.println("TestCase Name: " + name + ", Status: " + status + ", Execution Time: " + executionTime + " ms");
    }

    public String getStatus() {
        return status;
    }

    public long getExecutionTime() {
        return executionTime;
    }
}

public class TestCase {
    public static void main(String[] args) {
        List<Test> testList = Arrays.asList(
            new Test("test1", "passed", 120),
            new Test("test2", "failed", 1),
            new Test("test3", "failed", 109),
            new Test("test4", "passed", 90),
            new Test("test5", "passed", 10)
        );

       
        List<Test> sortedTests = testList.stream()
            .filter(test -> "passed".equalsIgnoreCase(test.getStatus()) || "failed".equalsIgnoreCase(test.getStatus()))
            .sorted(Comparator.comparingLong(Test::getExecutionTime))
            .collect(Collectors.toList());

 
        System.out.println("Sorted Test Cases:");
        sortedTests.forEach(Test::display);

   
        long passedCount = testList.stream()
            .filter(t1 -> "passed".equalsIgnoreCase(t1.getStatus()))
            .count();

        long failedCount = testList.stream()
            .filter(t1 -> "failed".equalsIgnoreCase(t1.getStatus()))
            .count();

      
        System.out.println("\nSummary Report:");
        System.out.println("Total Passed: " + passedCount);
        System.out.println("Total Failed: " + failedCount);
    }
}

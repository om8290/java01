package Assisment2;
import java.util.*;
public class Frequncy { 

    public static void main(String[] args) {
        List<Integer> temp1 = new ArrayList<>(Arrays.asList(1, 2, 3, 2, 4, 5, 3, 6, 3, 2, 2));

        int maxCnt = 0;
        int mostFreq = temp1.get(0);

        for (Integer i: temp1) {
            int count = Collections.frequency(temp1, i);
            if (count > maxCnt) {
                maxCnt = count;
                mostFreq = i;
            }
        }

        System.out.println("Most Frequent Element: " + mostFreq+ " (Frequency: " + maxCnt + ")");
    }
}


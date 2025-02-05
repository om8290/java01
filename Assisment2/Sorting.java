package Assisment2;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.Collections;
import java.util.List;

public class Sorting {
    public static void main(String []s){
         List<Integer>  arr= new ArrayList<>(Arrays.asList(15,22,32,45,15,66,78,18,39));
         System.out.println("this is the unsorted list"+ arr);
     Collections.sort(arr);
      System.out.println("Ascending order "+ arr);
       Collections.sort(arr, Collections.reverseOrder());
       System.out.println("Descending order"+arr);

    }
}

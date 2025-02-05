package Assisment2;

import java.util.*;
public class Listing {
    public static void main(String[] args) {
        
        List<Integer> temp1= new ArrayList<>();
        temp1.add(1);
        temp1.add(2);
        temp1.add(3);
         temp1.add(4);
         temp1.add(5);
          System.out.println("this is the array list before conversion" + temp1);
           List<Integer> temp2= new LinkedList<>(temp1);
           System.out.println("this is the linked list " + temp2);
            List<Integer> temp3= new ArrayList<>(temp2);
            System.out.println("this is the array list after conversion" + temp3);
            

    }
}

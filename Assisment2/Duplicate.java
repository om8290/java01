package Assisment2;
import java.util.List;
import java.util.Set;
import java.util.ArrayList;
 import java.util.HashSet;
public class Duplicate {
     public static void main(String []s){
         List<Integer> list1 = new ArrayList<>();
            list1.add(1);   
            list1.add(2);
            list1.add(3);
            list1.add(3);
            list1.add(4);
            list1.add(4);
            System.out.println("List1: " + list1);
             Set<Integer> set1 = new HashSet<>(list1);
              List<Integer>temp = new ArrayList<>(set1);
               System.out.println("answer by removing the duplicate" + temp);





     }
    
}

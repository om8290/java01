package Collection_2;

import java.util.ArrayDeque;
import java.util.Queue;

public class Queue1 {
    public static void main(String[] s) {       
        ArrayDeque<Integer> q = new ArrayDeque<>();
       
        // Integer polled = q.poll();
        // System.out.println("Result of poll(): " + polled); 
       
        // Integer PE = q.peek();
        // System.out.println(" peek(): " + PE); 
        //   Integer element = q.element();
        // System.out.println("element(): " + element);


         q.add(4);
         q.add(5);
         q.add(7);
          System.out.println(q);
          Integer polled = q.poll();
          System.out.println("Result of poll(): " + polled); 
          Integer PE = q.peek();
          System.out.println(" peek(): " + PE);
          Integer element = q.element(); 
          System.out.println("element(): " + element);
q.addFirst(2);
System.out.println(q);
q.offer(5);
System.out.println(q);
q.add(7);
System.out.println(q);
           

       
        
    }
}

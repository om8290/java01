package Collection_2;

import java.util.ArrayDeque;
import java.util.Queue;

public class Queue1 {
    public static void main(String[] s) {       
        Queue<Integer> q = new ArrayDeque<>();
       
        Integer polled = q.poll();
        System.out.println("Result of poll(): " + polled); 
       
        Integer PE = q.peek();
        System.out.println(" peek(): " + PE); 
          Integer element = q.element();
        System.out.println("element(): " + element);

       
        
    }
}

package Collection_2;

import java.util.LinkedList;
import java.util.Queue;

public class Ticket {
     public static void main(String[] args) {
        Queue<String> q1 = new LinkedList<>();

       
        q1.add("om");
        q1.add("ravi");
        q1.add("arun");
        System.out.println("Queue of LinkedList: " + q1);

       System.out.println("Serving: " + q1.poll()); 
        System.out.println("Serving: " + q1.poll()); 
        System.out.println("Serving: " + q1.poll()); 

       
      

       
    }
}

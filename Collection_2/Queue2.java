package Collection_2;
import java.util.LinkedList;
import java.util.Queue;
import java.util.ArrayDeque;

public class Queue2 {
     public static void main(String[] args) {
     Queue<Integer> q1= new ArrayDeque<>();
        q1.add(1);
        q1.add(2);
        q1.add(3);
        q1.add(4);
        q1.add(null);
        System.out.println("Queue of ArrayDeque: " + q1);
     }
}

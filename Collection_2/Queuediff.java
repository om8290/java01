package Collection_2;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Queuediff {
    public static void main(String[] args) {
        Queue<Integer> q = new ArrayBlockingQueue<>(3);
        
        q.offer(1);
        q.offer(2);
        q.offer(3);

        System.out.println("Queue: " + q);

        boolean added = q.offer(4);
        System.out.println(added);
        System.out.println("Queue: " + q);

        boolean addedAgain = q.offer(5);
        System.out.println(addedAgain);
        System.out.println("Queue: " + q);
    }
}

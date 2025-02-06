package Collection_2;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Priotyq {
    public static void main(String[] args) {
        PriorityQueue<Character> pq = new PriorityQueue<>(Comparator.reverseOrder());

        
        pq.add('B');
        pq.add('C');
        pq.add('A');
        pq.add('B');
        pq.add('b');
        pq.add('a');
        pq.add('d');
        pq.add('c');

        System.out.println("PriorityQueue: " + pq);

        
    }
}

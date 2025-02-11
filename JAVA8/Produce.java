package JAVA8;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
public class Produce {
        public static void main(String[] args) {        
        BlockingQueue<Integer> queue = new LinkedBlockingQueue<>(5);       
        Thread producer = new Thread(() -> {
            try {
                for (int i = 1; i <= 10; i++) {
                    queue.put(i); 
                    System.out.println("Produced: " + i);
                    Thread.sleep(500); 
                }
                queue.put(-1); 
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });       
        Thread consumer = new Thread(() -> {
            try {
                Integer item;
                while ((item = queue.take()) != -1) {
                    System.out.println("Consumed: " + item);
                    Thread.sleep(1000); 
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });       
        producer.start();
        consumer.start();
    }
}


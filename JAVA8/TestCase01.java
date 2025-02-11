package JAVA8;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class TestTask implements Runnable {
    private final String name;

    public TestTask(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        long startTime = System.currentTimeMillis();
        System.out.println(name + " started.");
        try {
            Thread.sleep(1000); 
        } catch (InterruptedException e) {
            System.out.println(name + " was interrupted.");
            Thread.currentThread().interrupt(); 
        }
        long endTime = System.currentTimeMillis();
        System.out.println(name + " completed in " + (endTime - startTime) + " ms.");
    }
}

public class TestCase01 {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(3);
        for (int i = 1; i <= 10; i++) {
            executor.submit(new TestTask("Test Case " + i));
        }
        executor.shutdown();
    }
}

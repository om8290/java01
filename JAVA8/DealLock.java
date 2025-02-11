package JAVA8;


public class DealLock {

    private final Object resource1 = new Object();
    private final Object resource2 = new Object();

    public static void main(String[] args) {
        DealLock example = new DealLock();
        example.createDeadlock();
        example.avoidDeadlock();
    }

    private void createDeadlock() {
        Thread thread1 = new Thread(() -> {
            synchronized (resource1) {
                System.out.println("Thread 1: Locked resource 1");

                // Simulate some work
                try { Thread.sleep(50); } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }

                synchronized (resource2) {
                    System.out.println("Thread 1: Locked resource 2");
                }
            }
        });

        Thread thread2 = new Thread(() -> {
            synchronized (resource2) {
                System.out.println("Thread 2: Locked resource 2");

                try { Thread.sleep(50); } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }

                synchronized (resource1) {
                    System.out.println("Thread 2: Locked resource 1");
                }
            }
        });

        thread1.start();
        thread2.start();
    }

    private void avoidDeadlock() {
        // Thread 1 and Thread 2 will both lock resource1 first, then resource2
        Runnable task = () -> {
            synchronized (resource1) {
                System.out.println(Thread.currentThread().getName() + ": Locked resource 1");

                // Simulate some work
                try { Thread.sleep(50); } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }

                synchronized (resource2) {
                    System.out.println(Thread.currentThread().getName() + ": Locked resource 2");
                }
            }
        };

        Thread thread1 = new Thread(task, "Thread 3");
        Thread thread2 = new Thread(task, "Thread 4");

        thread1.start();
        thread2.start();
    }
}

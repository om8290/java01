package JAVA8;

public class Voaltile{
   
    private static volatile boolean isActive = true;

    public static void main(String[] args) {
        
        Thread monitorThread = new Thread(() -> {
            System.out.println("Monitor Thread: Waiting for isActive to become false...");
            while (isActive) {
               
            }
            System.out.println("Monitor Thread: Detected isActive is false. Exiting...");
        });

        
        Thread updaterThread = new Thread(() -> {
            try {
                Thread.sleep(2000); 
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            System.out.println("Updater Thread: Setting isActive to false.");
            isActive = false; 
        });

        monitorThread.start();
        updaterThread.start();
    }
}


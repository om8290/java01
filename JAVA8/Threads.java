package JAVA8;
 class TestCase1 implements Runnable{
    private String  name;
     public TestCase1(String name){
        this .name= name;
         
     }
      @Override
       public void run(){
         System.out.println(name + "started");
          try{
            Thread.sleep(1000);
          }catch(InterruptedException e){
            System.out.println(name + "was interrupted");

          }
           System.out.println(name + " completed");
           
       }
 }
public class Threads {
    public static void main(String[] args) {
        Thread t1= new Thread( new TestCase1("test case 1"));
        Thread t2= new Thread( new TestCase1("test case 2"));
        Thread t3= new Thread( new TestCase1("test case 3"));
         t1.start();
         t2.start();;
         t3.start();
          try{
            t1.join();
             System.out.println("test 1 is there " + t1.isAlive());
            t2.join();
            System.out.println("test 2 is there " + t2.isAlive());
            t3.join();
            System.out.println("test 3 is there " + t3.isAlive());
          }
           catch(InterruptedException e){
             System.out.println(" main thread interrupted");
           }
        System.out.println(" all the test cases have completed");
    }
}

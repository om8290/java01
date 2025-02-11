package JAVA8;

 class Counter {
     private int cnt =0;
      public synchronized void increment(){
         cnt++;
      }
       public int getcnt(){
        return cnt;
       }
 }
public class Lock {
    public static void main(String[] args) {
        Counter cnt1= new Counter();
        Thread t1= new Thread(()->{
             for(int i=0; i< 1000;i++){
                 cnt1.increment();
             }
        });
        Thread t2= new Thread(()->{
            for(int i=0; i< 1000;i++){
                cnt1.increment();
            }
       });
        t1.start();
         t2.start();
         try {
            t1.join();
            t2.join();
         } catch (Exception e) {
            System.out.println(" the error is in the inreprter");
         }
         
           System.out.println(" final cnt "+ cnt1 .getcnt());

        }
}

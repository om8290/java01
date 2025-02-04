import java.util.Arrays;
import java.util.Scanner;


public class TestScore {
   public static void main(String []a){
     Scanner sc= new Scanner(System.in);
     System.out.println(" Enter the number of the test score ");
      int n = sc.nextInt();
      int[] score = new int[n];
       for (int i=0;i< n;i++){
         score[i]= sc.nextInt();
       }
       
             System.out.println(" this is the test score array"+ Arrays.toString(score));
        

   Arrays.sort(score);
   
      int  highest = score[n-1];
      int lowest = score[0];
       double average= avg(score);
        
       System.out.println("the highest number is "+ highest);
        System.out.println("the lowest number is "+lowest);
        System.out.println("the avrage of  number is "+ average);
      
        System.out.println("the sorted array is " + Arrays.toString(score));
        System.out.println("the sorted  array in  descending order ");
         for(int i=n-1;i>=0;i--){
            System.out.print(score[i] +" ");

         }

   }
   public static  double avg(int [] score){
    int n= score.length;
     int sum=0;
      for(int i=0; i< n;i++){
         sum+= score[i];
      } 
       return sum/n;
     
 }
}


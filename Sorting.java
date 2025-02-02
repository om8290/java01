import java.util.Arrays;

public class Sorting {
     public static void main (String [] a ){
          int arr[]= {9,7,5,3,2,6};
     Arrays.sort(arr);
      System.out.println("sorted array "+ Arrays.toString(arr));
     int index= Arrays.binarySearch(arr,9);
       System.out.println(index);
     }
     

    
}

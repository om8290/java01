import java.util.Arrays;

public class Mutalble {
    public static void main(String []a){
        //  mutabel
         int arr[]={ 10,40,60,48};
         System.out.println(Arrays.toString(arr));
          Arrays.sort(arr);
           System.out.println(Arrays.toString(arr));
            // unmutable 
            String s = "welcome";
            System.out.println(s); // Output: welcome
    
            // Concatenate and reassign the result to 's'
            s = s.concat(" to join");
            System.out.println(s); 
    }
}

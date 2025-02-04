import java.util.Arrays;

public class Inner {
     class Log{
         void log(String st){
             System.out.println("Log "+ st);
         }
     }
      public static void main(String []s){
        Inner obj1= new Inner();
         Log Log1= obj1.new Log();
         int [] arr= {10,20,30,40,50};
          int n= arr.length;
         Integer[] intarray = new Integer[n];
          for(int i=0;i<n;i++){
             intarray[i]= arr[i];

          }
 Log1.log("Autoboxed Integer Array");
  System.out.println(" this is the in box array"+ Arrays.toString(intarray));
int m= intarray.length;
  int [] unbox= new int[m];
   for(int i=0;i<m;i++){
     unbox[i]= intarray[i];
   }
   System.out.println(" this is the outbox array"+ Arrays.toString(unbox));
      }
}

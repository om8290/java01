import java.util.Scanner;

public class Delivery {
    public static void main(String[]a){
         Scanner sc= new Scanner(System.in);
         System.out.print("Enter delivery area (Local/Remote/Other): ");
         String area = sc.nextLine().trim();
         System.out.print("Enter order amount: $");
         int amount = sc.nextInt();
         if (area.equals("Local")){
             if(amount>=100){
                 System.out.println("Order category : fast Track");
             }
              else{
                System.out.println("order category :standard delivery");
              }

         } else if(area.equals("remote")){
            if (amount >= 200) {
                System.out.println("Order Category: Priority Delivery");
            } else {
                System.out.println("Order  Category: Normal Delivery");
            }
         }
         else {
            System.out.println("Area not supported.");
        }
         sc.close();

    }
}

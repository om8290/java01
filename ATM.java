import java.util.Scanner;
public class ATM {
    public static void main(String []s){
         Scanner sc= new Scanner(System.in);
          int totalblance= 1000;
           int cnt=0;
            while(cnt<=3) {
                 System.out.println(" Enter the withdrwal amount");
                int money =sc.nextInt();
                if( money %50!=0){
                     System.out.println("the amount is not divible of 50 ");
                      cnt++;
                       continue;
                }
                 if(money>totalblance){
                    System.out.println("Not enough blance");

                    cnt++;
                    continue;
                 } else{

                    totalblance = totalblance-money;
                    System.out.println("total blance is "+ totalblance);
                  break;
                 }               
            }
            if (cnt ==3 ){
                 System.out.println( " transcation limit reach out");
            }
             sc.close();
    }
}

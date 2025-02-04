package BankApplication;

public class Main {
     public static void main(String []a){
        SavingAccount account1= new SavingAccount("Om rastogi", 1000.0, 5);
         System.out.println("Account Number" + account1.getAccountNumber());;
         System.out.println("Inital Balance "+ account1.getBalance());

          account1.deposit(500);
          account1.withdraw(200);
           System.out.println( "updated balance "+ account1.getBalance());
           double interest= account1.cal();
            System.out.println("Annual Interst "+ interest);
     }
    
}

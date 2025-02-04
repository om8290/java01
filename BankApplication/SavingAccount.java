package BankApplication;

  public class SavingAccount extends BankAccount {
    private double interest ;
     public SavingAccount(String accno, double initialBalance, double interest){
        super(accno, initialBalance);
         this.interest=interest;
     }
      public double cal(){
         return getBalance() * (interest/100);
      }
    
}

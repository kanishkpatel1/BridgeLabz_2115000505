

 class InsufficientBalanceException extends Exception{
    public InsufficientBalanceException(String message) {
        super(message);
    }
}
public class Q10_BankTransactionSystem {
    static int totalBalance;
    public static void main(String[] args) {
           try{
                deposit(200);
                withdraw(-500);
           } 
           catch(Exception e){
            System.out.println(e.getMessage());
           }
    }

    public static void withdraw(double amount) throws InsufficientBalanceException , IllegalArgumentException{
        if(amount<0) throw new IllegalArgumentException("Amount to withdraw should be positive ");  
        if((totalBalance-amount)<0) throw new InsufficientBalanceException("Entered amount is high than the current balance in the account");
        totalBalance-=amount;
    }
    
    public static void deposit(double amount) throws IllegalArgumentException{
        if(amount <0) throw new IllegalArgumentException("Deposit amount should be positive");
    }
}

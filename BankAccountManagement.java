import java.util.Scanner;

class BankAccount {
    public String accountNumber;
    protected String accountHolder;
    private double balance;

    BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
    }
}

class SavingsAccount extends BankAccount {
    SavingsAccount(String accountNumber, String accountHolder, double balance) {
        super(accountNumber, accountHolder, balance);
    }

    public void displaySavingsAccountDetails() {
        System.out.println("Savings Account Details:");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + getBalance());
    }
}

public class BankAccountManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter account number:");
        String accountNumber = sc.nextLine();

        System.out.println("Enter account holder name:");
        String accountHolder = sc.nextLine();

        System.out.println("Enter initial balance:");
        double balance = sc.nextDouble();

        BankAccount account = new BankAccount(accountNumber, accountHolder, balance);
        account.displayAccountDetails();

        System.out.println("\nEnter new balance:");
        double newBalance = sc.nextDouble();
        account.setBalance(newBalance);
        System.out.println("Updated Balance: " + account.getBalance());

        sc.nextLine(); 

        System.out.println("\nEnter savings account number:");
        String savingsAccountNumber = sc.nextLine();

        System.out.println("Enter savings account holder name:");
        String savingsAccountHolder = sc.nextLine();

        System.out.println("Enter savings account balance:");
        double savingsBalance = sc.nextDouble();

        SavingsAccount savingsAccount = new SavingsAccount(savingsAccountNumber, savingsAccountHolder, savingsBalance);
        savingsAccount.displaySavingsAccountDetails();

        sc.close();
    }
}

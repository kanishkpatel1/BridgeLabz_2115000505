
import java.util.*;
class BankAccount{
    static String bankName="";
    final int accountNumber;
    String accountHolderName;
    private static int totalAccount=0;

    BankAccount(String accountHolderName,int accountNumber){
        this.accountHolderName=accountHolderName;
        this.accountNumber=accountNumber;
        totalAccount++;
    }
    static void getTotalAccounts(){
        System.out.println("Total number of Accounts are "+totalAccount);
    }
}


public class Q01_BankAccountSystem {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the bank name: ");
        BankAccount.bankName=sc.nextLine();

        System.out.println("Enter the number of accounts ");
        int n=sc.nextInt();
        sc.nextLine();

        BankAccount[] accounts=new BankAccount[n];

        for(int i=0;i<n;i++){
            System.out.println("\nEnter account holder's name for Account "+(i+1)+": ");
            String name=sc.nextLine();

            System.out.println("Enter account number for Account "+(i+1)+": ");
            int number=sc.nextInt();
            sc.nextLine();

            accounts[i]=new BankAccount(name,number);
        }

        // Display all accounts

        System.out.println("\nBank Name: "+BankAccount.bankName);
        for(int i=0;i<n;i++){
            if(accounts[i] instanceof BankAccount){
                System.out.println("\nAccount Holder: "+accounts[i].accountHolderName);
                System.out.println("Account Number: "+accounts[i].accountNumber);
            }
        }
        BankAccount.getTotalAccounts();
        sc.close();

    }
}
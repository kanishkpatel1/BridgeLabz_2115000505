import java.io.*;
import java.util.*;
public class Q7_Finally{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        try{
            System.out.println("Enter the value of a in Integer :");

            int a=sc.nextInt();
            System.out.println("Enter the value of b");
            int b=sc.nextInt();
            System.out.println("Resul of "+a+"/"+b+" is " +(a/b));
        }
        catch(ArithmeticException e){
            System.out.println("Arithmetic exception occur "+e.getMessage());
        }
        finally{
            System.out.println("Operation Completed");
        }
    }
}
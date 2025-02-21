import java.io.*;
import java.util.*;
public class Q2_Unchecked{
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
        catch(InputMismatchException e){
            System.out.println("Input mismatch exception occur "+e.getMessage());
        }
    }
}
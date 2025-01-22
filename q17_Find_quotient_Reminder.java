import java.util.*;
public class q17_Find_quotient_Reminder {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    int q=a/b;
    int r=a%b;
    System.out.println("The Quotient is "+q +" and Reminder is "+r +" of two number "+a+" and "+b);
    } 
}

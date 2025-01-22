import java.util.*;
public class q9_discount_fee {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int fee=sc.nextInt();
        int discountPercent=sc.nextInt();
        double discout=(fee*discountPercent)/100;
        
        double discountedfee=fee-discout;
        System.out.println("The discount amount is INR "+discout+" and final discounted fee is INR "+discountedfee);
    }
}

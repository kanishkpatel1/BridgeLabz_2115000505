import java.util.*;
public class q15_Calculate_Total_Prize {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int unitPrice=sc.nextInt();
        int quantity=sc.nextInt();
        System.out.println("The total purchase price is INR "+unitPrice*quantity+" if the quantity is "+quantity +" and unit price is INR "+unitPrice);
    }
}

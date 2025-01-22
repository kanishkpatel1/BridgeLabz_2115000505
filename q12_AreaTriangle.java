import java.util.*;
public class q12_AreaTriangle {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);

    int base=sc.nextInt();
    int h=sc.nextInt();
    double at=0.5*base*h;
   
    double atin=at/2.54;
    double atf=atin/12;
    System.out.println("Your Area of Triangle in cm is "+at+" while in feet is "+atf+" and inches in "+atin);
   } 
}

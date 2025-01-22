
import java.util.*;
public class q10_Height_Convert {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Height in centimeters");
        int h=sc.nextInt();
        double inches=h/2.54;
        double foot=inches/12;
        System.out.println("Your Height in cm is "+h+" while in feet is "+foot+" and inches is "+inches);
     }
}

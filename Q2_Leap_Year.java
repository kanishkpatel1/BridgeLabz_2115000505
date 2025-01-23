import java.util.*;
public class Q1_Leap_Year {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int year=sc.nextInt();
            if(year>=1582 && (year%100==0 && year%400==0) || (year%100!=0 && year%4==0))
                System.out.println("Year "+year +" is a leap year");
            else
            System.out.println("Year "+year +" is not a leap year");  
     }
}

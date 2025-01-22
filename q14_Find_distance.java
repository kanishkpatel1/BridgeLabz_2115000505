import java.util.*;
public class q14_Find_distance{
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter distance in feets ");
    int d=sc.nextInt();
    double dy=d/3;
    double dm=dy/1760;
    System.out.println("Your Distance in feet is "+d+" while in yards is "+dy+" and miles is "+dm);
}
}
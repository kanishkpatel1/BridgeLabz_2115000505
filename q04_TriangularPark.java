import java.util.*;
public class q04_TriangularPark {
    public static double numberOfRounds(double perimeter,int distance){
        double rounds=(distance/perimeter);
        return rounds;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter side1 of triangle");
        double a=sc.nextInt();

        System.out.println("Enter side2 of triangle");
        double b=sc.nextInt();
        System.out.println("enter side3 of triangle");
        int c=sc.nextInt();
        int distance=5;
        double perimeter=(a+b+c)/1000;
        double rounds = numberOfRounds(perimeter, distance);
        
        System.out.printf("Number of rounds athlete needs to complete 5km is : ", rounds);
        
        sc.close();



    }
    
}

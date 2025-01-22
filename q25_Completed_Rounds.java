import java.util.*;
public class q25_Completed_Rounds {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int side1=sc.nextInt();
        int side2=sc.nextInt();
        int side3=sc.nextInt();
        int oneRoundinKm=(side1+side2+side3)/1000;  
        double totalRound=oneRoundinKm/5;
        System.out.println("The total number of rounds the athelete will run is "+totalRound+" to complete 5 km");  
    }
}

import java.util.*;
public class q01_SimpleInterest{

    public static void SimpleInterest(int principle,int rate,int time){
        double si=(double)(principle*rate*time)/100;
        System.out.println("The Simple Interest is "+si+" for Principal "+principle+" , Rate of Interest "+rate+" and Time "+time);
    }
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Principal");
        int pinciple=sc.nextInt();
        System.out.println("Enter Rate of Interest");
        int rate=sc.nextInt();
        System.out.println("Enter Time");
        int time=sc.nextInt();
        SimpleInterest(pinciple, rate, time);
        sc.close();
    }
}
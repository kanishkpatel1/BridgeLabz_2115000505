import java.util.*;
public class q21_ConvertToCelcius {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int f=sc.nextInt();
        double cel=(f-32)*(5/9);
        System.out.println("The "+f+ " fahrenheit is "+cel+" celsius");
    }
}

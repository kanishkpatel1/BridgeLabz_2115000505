import java.util.*;
public class Q7_BMI {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the weight in kg ");
        double weight=sc.nextDouble();
        System.out.println("Enter the height in cm ");
        int height=sc.nextInt();
        double heightInMeter=height/100;
        double bmi=weight/(heightInMeter*heightInMeter);
        if(bmi>=40) System.out.println("Obese");
        else if(bmi>=25) System.out.println("Overweight");
        else if(bmi>=18.5) System.out.println("Normal");
        else System.out.println("Underweight");
 }
}

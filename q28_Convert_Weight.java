import java.util.*;
public class q28_Convert_Weight {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the weight in pounds");
        int weight=sc.nextInt();
        double weightInKg=weight*2.2;
        System.out.println("The weight of the person in pound is "+ weight+ " and in kg is "+weightInKg);
    }
}

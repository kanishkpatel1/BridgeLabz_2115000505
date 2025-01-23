import java.util.*;
public class Q14_Check_First_Smallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int number1 = sc.nextInt();

        System.out.print("Enter the second number: ");
        int number2 = sc.nextInt();

        System.out.print("Enter the third number: ");
        int number3 = sc.nextInt();

        if (number1 <= number2 && number1 <= number3) {
            System.out.println("Yes the first number the smallest");
        } else {
            System.out.println("No the first number is not  the smallest");
        }

    }
}

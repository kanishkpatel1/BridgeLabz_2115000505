import java.util.*;
public class Q13_Divisible {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        if (number % 5 == 0) {
            System.out.println("Yes the number " + number + " is divisible by 5");
        } else {
            System.out.println("No the number " + number + " is not divisible by 5");
        }
    }
}

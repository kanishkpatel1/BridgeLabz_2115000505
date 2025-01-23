import java.util.*;
public class Q22_Sum_of_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0.0;
        double input;

        while (true) {
            System.out.print("Enter a number (or 0 to stop): ");
            input = sc.nextDouble();

            if (input == 0) {
                break;
            }

            total += input;
        }

        System.out.println("Total sum: " + total);
    }
}

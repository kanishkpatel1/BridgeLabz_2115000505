import java.util.*;
public class Q23_Sum_whileloop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double total = 0.0;
        double input;

        while (true) {
            System.out.print("Enter a number (or 0 or a negative number to stop): ");
            input = scanner.nextDouble();

            if (input <= 0) {
                break;
            }

            total += input;
        }

        System.out.println("Total sum: " + total);
    }
}

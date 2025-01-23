import java.util.*;
public class Q4_Sum_All_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] numbers = new double[10];
        double total = 0.0;
        int index = 0;

        while (true) {
            double input = sc.nextDouble();
            if (input <= 0 || index == 10) {
                break;
            }
            numbers[index] = input;
            index++;
        }

        for (int i = 0; i < index; i++) {
            total += numbers[i];
        }

        System.out.println("Numbers entered:");
        for (int i = 0; i < index; i++) {
            System.out.println(numbers[i]);
        }

        System.out.println("Sum: " + total);
    }
}

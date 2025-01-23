import java.util.Scanner;
public class Q9_Greatest_Factor {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int greatestFactor = 1;

        for (int i = n - 1; i >= 1; i--) {
            if (n % i == 0) {
                greatestFactor = i;
                break;
            }
        }
        System.out.println("The greatest factor of " + n + " is " + greatestFactor);
    }
}



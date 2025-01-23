import java.util.*;

public class Q31_Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = n;
        int sum = 0;
        while (n > 0) {
            int temp = n % 10;
            sum = sum + (temp * temp * temp);
            n = n / 10;
        }
        if (sum == m) {
            System.out.println("It is a armstrong number");
        } else {
            System.out.println("Not a armstrong number");
        }
    }
}

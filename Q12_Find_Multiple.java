import java.util.*;

public class Q12_Find_Multiple {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        System.out.println("The multiples of " + number + " below 100 are:");

        for (int i = 100; i >= 1; i--) {
            if (number % i == 0) {
                System.out.println(i);
            }
        }
    }
}

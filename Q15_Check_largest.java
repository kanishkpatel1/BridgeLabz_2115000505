import java.util.*;
public class Q15_Check_largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int n1 = sc.nextInt();

        System.out.print("Enter the second number: ");
        int n2 = sc.nextInt();

        System.out.print("Enter the third number: ");
        int n3 = sc.nextInt();

        System.out.println("Is the first number the largest? " + (n1 >= n2 && n1 >= n3 ? "Yes" : "No"));
        System.out.println("Is the second number the largest? " + (n2 >= n1 && n2 >= n3 ? "Yes" : "No"));
        System.out.println("Is the third number the largest? " + (n3 >= n1 && n3 >= n2 ? "Yes" : "No"));
    }
}

import java.util.*;
public class Q26_FindFactorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a positive integer: ");
        int n = sc.nextInt();
        
        if (n < 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }
        
        int factorial = 1;
        int i = 1;
        while (i <= n) {
            factorial *= i;
            i++;
        }
        
        System.out.println("Factorial of " + n + " is " + factorial);
    }
}

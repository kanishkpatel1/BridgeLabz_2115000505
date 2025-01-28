
    
import java.util.Scanner;

public class Q4_Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the number of terms for the Fibonacci sequence:");
        int terms = scanner.nextInt();
        
        generateFibonacci(terms);
        
        scanner.close();
    }

    public static void generateFibonacci(int terms) {
        int a = 0, b = 1;
        for (int i = 1; i <= terms; i++) {
            System.out.print(a + " ");
            int nextTerm = a + b;
            a = b;
            b = nextTerm;
        }
        System.out.println();
    }
}


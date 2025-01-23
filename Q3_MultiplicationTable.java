import java.util.Scanner;

public class Q3_MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to display its multiplication table: ");
        int n = scanner.nextInt();
        int[] arr = new int[10];
        
        for (int i = 1; i <= 10; i++) {
            arr[i - 1] = n * i;
        }

        System.out.println("Multiplication Table of " + n + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " * " + i + " = " + arr[i - 1]);
        }
        
        scanner.close();
    }
}

import java.util.Scanner;

public class Q2_MaximumOfThree {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter three integers:");
        
        int num1 = getInput(scanner);
        int num2 = getInput(scanner);
        int num3 = getInput(scanner);
        
        int max = findMax(num1, num2, num3);
        
        System.out.println("The maximum of the three numbers is: " + max);
        
        scanner.close();
    }
    
    public static int getInput(Scanner scanner) {
        return scanner.nextInt();
    }
    
    public static int findMax(int a, int b, int c) {
        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        return max;
    }
}

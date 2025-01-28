import java.util.Scanner;

public class Q9_BasicCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the first number:");
        double num1 = scanner.nextDouble();
        
        System.out.println("Enter the second number:");
        double num2 = scanner.nextDouble();
        
        System.out.println("Choose an operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        int choice = scanner.nextInt();
        
        switch (choice) {
            case 1:
                double sum = add(num1, num2);
                System.out.println("Result: " + sum);
                break;
            case 2:
                double difference = subtract(num1, num2);
                System.out.println("Result: " + difference);
                break;
            case 3:
                double product = multiply(num1, num2);
                System.out.println("Result: " + product);
                break;
            case 4:
                if (num2 != 0) {
                    double quotient = divide(num1, num2);
                    System.out.println("Result: " + quotient);
                } else {
                    System.out.println("Error: Division by zero.");
                }
                break;
            default:
                System.out.println("Invalid operation choice.");
                break;
        }
        
        scanner.close();
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        return a / b;
    }
}

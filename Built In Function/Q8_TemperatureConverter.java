import java.util.Scanner;

public class Q8_TemperatureConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter 1 to convert Fahrenheit to Celsius");
        System.out.println("Enter 2 to convert Celsius to Fahrenheit");
        int choice = scanner.nextInt();
        
        if (choice == 1) {
            System.out.println("Enter temperature in Fahrenheit:");
            double fahrenheit = scanner.nextDouble();
            double celsius = fahrenheitToCelsius(fahrenheit);
            System.out.println(fahrenheit + " Fahrenheit is " + celsius + " Celsius.");
        } else if (choice == 2) {
            System.out.println("Enter temperature in Celsius:");
            double celsius = scanner.nextDouble();
            double fahrenheit = celsiusToFahrenheit(celsius);
            System.out.println(celsius + " Celsius is " + fahrenheit + " Fahrenheit.");
        } else {
            System.out.println("Invalid choice.");
        }
        
        scanner.close();
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
}

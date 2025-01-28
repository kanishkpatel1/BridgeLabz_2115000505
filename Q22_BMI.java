import java.util.Scanner;

public class Q22_BMI {

    public static double calculateBMI(double weight, double height) {
        height = height / 100; // Convert height from cm to meters
        return weight / (height * height);
    }

    public static String getBMIStatus(double bmi) {
        if (bmi >= 40) {
            return "Obese";
        } else if (bmi >= 25) {
            return "Overweight";
        } else if (bmi >= 18.5) {
            return "Normal";
        } else {
            return "Underweight";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[][] bmiData = new double[10][3];  // 2D array to store weight, height, and BMI

        // Take user input for weight and height
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter details for person " + (i + 1) + ":");
            System.out.print("Weight (in kg): ");
            bmiData[i][0] = scanner.nextDouble();
            System.out.print("Height (in cm): ");
            bmiData[i][1] = scanner.nextDouble();
            bmiData[i][2] = calculateBMI(bmiData[i][0], bmiData[i][1]);
        }

        // Display BMI and status for each person
        System.out.println("\nBMI and Status of Team Members:");
        System.out.println("Person\tWeight (kg)\tHeight (cm)\tBMI\tStatus");

        for (int i = 0; i < 10; i++) {
            double bmi = bmiData[i][2];
            String status = getBMIStatus(bmi);
            System.out.printf("%d\t%.2f\t\t%.2f\t\t%.2f\t%s\n", i + 1, bmiData[i][0], bmiData[i][1], bmi, status);
        }

        scanner.close();
    }
}

import java.util.*;

public class Q16_BMI_Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of persons: ");
        int numPersons = sc.nextInt();

        double[] heights = new double[numPersons];
        double[] weights = new double[numPersons];
        double[] bmis = new double[numPersons];
        String[] weightStatus = new String[numPersons];

        for (int i = 0; i < numPersons; i++) {
            System.out.println("Enter details for person " + (i + 1));

            System.out.print("Enter height in meters: ");
            heights[i] = sc.nextDouble();

            System.out.print("Enter weight in kilograms: ");
            weights[i] = sc.nextDouble();

            bmis[i] = weights[i] / (heights[i] * heights[i]);

            if (bmis[i] < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (bmis[i] >= 18.5 && bmis[i] <= 24.9) {
                weightStatus[i] = "Normal";
            } else if (bmis[i] >= 25.0 && bmis[i] <= 39.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        for (int i = 0; i < numPersons; i++) {
            System.out.println("Person number "+i+"'s ' "+"Height is "+ heights[i] +" weight is "+ weights[i]+" bmi is "+ bmis[i] +" and status is "+weightStatus[i]);
        }
    }
}

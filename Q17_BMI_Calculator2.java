import java.util.*;

public class Q17_BMI_Calculator2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of persons: ");
        int numPersons = sc.nextInt();

        double[][] personData = new double[numPersons][3];
        String[] weightStatus = new String[numPersons];

        for (int i = 0; i < numPersons; i++) {
            System.out.println("Enter details for person " + (i + 1));

            double height, weight;
            do {
                System.out.print("Enter height in meters: ");
                height = sc.nextDouble();
                if (height <= 0) {
                    System.out.println("Height must be a positive value.");
                }
            } while (height <= 0);

            do {
                System.out.print("Enter weight in kilograms: ");
                weight = sc.nextDouble();
                if (weight <= 0) {
                    System.out.println("Weight must be a positive value.");
                }
            } while (weight <= 0);

            personData[i][0] = height;
            personData[i][1] = weight;

            personData[i][2] = weight / (height * height);

            if (personData[i][2] < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (personData[i][2] >= 18.5 && personData[i][2] <= 24.9) {
                weightStatus[i] = "Normal";
            } else if (personData[i][2] >= 25.0 && personData[i][2] <= 39.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        for (int i = 0; i < numPersons; i++) {
            System.out.println("Person number " + (i + 1) + "'s height is " + personData[i][0] + ", weight is " + personData[i][1] + ", BMI is " + personData[i][2] + " and status is " + weightStatus[i]);
        }
    }
}

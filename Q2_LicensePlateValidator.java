package Regex;

import java.util.Scanner;

public class Q2_LicensePlateValidator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter license plate number: ");
        String licensePlate = scanner.nextLine();

        if (isValidLicensePlate(licensePlate)) {
            System.out.printf("\"%s\" is Valid\n", licensePlate.toUpperCase());
        } else {
            System.out.printf("\"%s\" is Invalid\n", licensePlate);
        }

        scanner.close();
    }

    public static boolean isValidLicensePlate(String licensePlate) {
        if (licensePlate.length() != 6) {
            return false;
        }

        String firstPart = licensePlate.substring(0, 2).toUpperCase();
        String secondPart = licensePlate.substring(2);

        if (!firstPart.matches("[A-Z]{2}")) {
            return false;
        }

        if (!secondPart.matches("\\d{4}")) {
            return false;
        }

        return true;
    }
}

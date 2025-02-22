package Regex;
import java.util.Scanner;

public class Q3_HexColorValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter hex color code (Please begin code with #): ");
        String hexColor = scanner.nextLine();

        if (isValidHexColor(hexColor)) {
            System.out.printf("\"%s\" → Valid\n", hexColor);
        } else {
            System.out.printf("\"%s\" → Invalid\n", hexColor);
        }
    }

    public static boolean isValidHexColor(String hexColor) {
        if (hexColor.length() != 7 || hexColor.charAt(0) != '#') {
            return false;
        }

        String colorCode = hexColor.substring(1);
        return colorCode.matches("[0-9a-fA-F]{6}");
    }
}

package Regex;

import java.util.Scanner;

public class Q1_UsernameValidator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter username: ");
        String username = scanner.nextLine();

        if (isValidUsername(username)) {
            System.out.printf("\"%s\" → Valid\n", username);
        } else {
            System.out.printf("\"%s\" → Invalid\n", username);
        }
    }

    public static boolean isValidUsername(String username) {
        if (username.length() < 5 || username.length() > 15) {
            return false;
        }

        if (!Character.isLetter(username.charAt(0))) {
            return false;
        }

        for (int i = 0; i < username.length(); i++) {
            char ch = username.charAt(i);
            if (!(Character.isLetterOrDigit(ch) || ch == '_')) {
                return false;
            }
        }

        return true;
    }
}

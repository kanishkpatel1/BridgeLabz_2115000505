package Regex;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Q11_CreditCardValidator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Credit Card Number: ");
        String cardNumber = sc.nextLine();

        if (isValidCreditCard(cardNumber)) {
            if (isVisa(cardNumber)) {
                System.out.println("Valid Visa Card Number");
            } else if (isMasterCard(cardNumber)) {
                System.out.println("Valid MasterCard Number");
            }
        } else {
            System.out.println("Invalid Credit Card Number");
        }
    }

    public static boolean isValidCreditCard(String cardNumber) {
        String cardRegex = "^(4\\d{15}|5[1-5]\\d{14})$";
        Pattern pattern = Pattern.compile(cardRegex);
        Matcher matcher = pattern.matcher(cardNumber);
        return matcher.matches();
    }

    public static boolean isVisa(String cardNumber) {
        return cardNumber.startsWith("4") && cardNumber.length() == 16;
    }

    public static boolean isMasterCard(String cardNumber) {
        return cardNumber.startsWith("5") && cardNumber.length() == 16;
    }
}

package Regex;
import java.util.*;
import java.util.regex.*;

public class Q15_SSNValidator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter SSN: ");
        String text = sc.nextLine();

        String ssn = extractSSN(text);
        if (ssn != null) {
            validateSSN(ssn);
        } else {
            System.out.println("No SSN found in the text.");
        }
    }

    public static String extractSSN(String text) {
        Pattern pattern = Pattern.compile("\\d{3}-\\d{2}-\\d{4}");
        Matcher matcher = pattern.matcher(text);

        if (matcher.find()) {
            return matcher.group();
        }
        return null;
    }

    public static void validateSSN(String ssn) {
        String ssnRegex = "^(?!000|666|9\\d{2})\\d{3}-(?!00)\\d{2}-(?!0000)\\d{4}$";
        Pattern pattern = Pattern.compile(ssnRegex);
        Matcher matcher = pattern.matcher(ssn);

        if (matcher.matches()) {
            System.out.println("\"" + ssn + "\" is valid");
        } else {
            System.out.println("\"" + ssn + "\" SSN is invalid");
        }
    }
}


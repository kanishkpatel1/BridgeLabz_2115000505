package Regex;
import java.util.*;
import java.util.regex.*;

public class Q13_CurrencyExtractor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        extractCurrencyValues(text);
    }

    public static void extractCurrencyValues(String text) {
        Pattern pattern = Pattern.compile("\\$?\\d+(\\.\\d{2})?");
        Matcher matcher = pattern.matcher(text);

        StringBuilder result = new StringBuilder();
        while (matcher.find()) {
            result.append(matcher.group()).append(", ");
        }

        if (result.length() > 0) {
            result.setLength(result.length() - 2);
            System.out.println("Extracted Currency Values: " + result);
        } else {
            System.out.println("No currency values found.");
        }
    }
}

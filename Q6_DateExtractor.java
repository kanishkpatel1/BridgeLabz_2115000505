package Regex;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Q6_DateExtractor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = scanner.nextLine();

        extractDates(text);
    }

    public static void extractDates(String text) {
//        String dateRegex = "\\b\\d{2}/\\d{2}/\\d{4}\\b";
        String dateRegex = "\\b(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/(([1-9][0-9]{3})|([0-9]{3}[1-9]))\\b";

        Pattern pattern = Pattern.compile(dateRegex);
        Matcher matcher = pattern.matcher(text);

        boolean found = false;

        while (matcher.find()) {
            System.out.print(matcher.group() + ", ");
            found = true;
        }

        if (!found) {
            System.out.println("No Match");
        }
    }
}

package Regex;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Q5_CapitalizedWordsExtractor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = scanner.nextLine();

        extractCapitalizedWords(text);
    }

    public static void extractCapitalizedWords(String text) {
        String capitalizedRegex = "\\b[A-Z][a-z]*\\b";
        Pattern pattern = Pattern.compile(capitalizedRegex);
        Matcher matcher = pattern.matcher(text);

        boolean found = false;

        while (matcher.find()) {
            System.out.print(matcher.group() + ", ");
            found = true;
        }

        if (!found)
            System.out.println("No capitalized words found.");

    }
}

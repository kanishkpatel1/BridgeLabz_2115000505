package Regex;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Q7_LinkExtractor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = scanner.nextLine();

        extractLinks(text);
    }

    public static void extractLinks(String text) {
        String linkRegex = "\\bhttps?://[a-zA-Z0-9.-]+(?:/[a-zA-Z0-9&%_./-]*)?\\b";
        Pattern pattern = Pattern.compile(linkRegex);
        Matcher matcher = pattern.matcher(text);

        boolean found = false;

        while (matcher.find()) {
            System.out.print(matcher.group() + ", ");
            found = true;
        }

        if (!found) {
            System.out.println("No links found.");
        }
    }
}

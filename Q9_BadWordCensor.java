package Regex;
import java.util.Scanner;
import java.util.Arrays;
import java.util.List;

public class Q9_BadWordCensor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = scanner.nextLine();

        List<String> badWords = Arrays.asList("damn", "stupid", "shit");

        String result = censorBadWords(text, badWords);
        System.out.println("Modified text: " + result);
    }

    public static String censorBadWords(String text, List<String> badWords) {
        for (String badWord : badWords) {
            text = text.replaceAll("(?i)\\b" + badWord + "\\b", "****");
        }
        return text;
    }
}

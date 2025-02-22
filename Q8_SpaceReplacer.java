package Regex;
import java.util.Scanner;

public class Q8_SpaceReplacer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = scanner.nextLine();

        String result = replaceMultipleSpaces(text);
        System.out.println("Modified text: " + result);
    }

    public static String replaceMultipleSpaces(String text) {
        return text.replaceAll("\\s+", " ").trim();
    }
}

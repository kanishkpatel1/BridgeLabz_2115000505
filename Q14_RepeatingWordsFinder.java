package Regex;
import java.util.*;

public class Q14_RepeatingWordsFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        findRepeatingWords(text);
    }

    public static void findRepeatingWords(String text) {
        String[] words = text.split("\\s+");
        Set<String> seen = new HashSet<>();
        Set<String> repeated = new HashSet<>();

        for (String word : words) {
            if (!seen.add(word.toLowerCase())) {
                repeated.add(word.toLowerCase());
            }
        }

        if (!repeated.isEmpty()) {
            System.out.println("Repeating Words: " + String.join(", ", repeated));
        } else {
            System.out.println("No repeating words found.");
        }
    }
}

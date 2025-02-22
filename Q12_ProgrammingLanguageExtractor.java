package Regex;
import java.util.*;
import java.util.regex.*;

public class Q12_ProgrammingLanguageExtractor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        extractProgrammingLanguages(text);
    }

    public static void extractProgrammingLanguages(String text) {
        List<String> programmingLanguages = Arrays.asList("Java", "Python", "JavaScript", "Go", "C", "C++", "Ruby", "PHP", "Swift", "Kotlin", "Rust", "TypeScript");

        StringBuilder result = new StringBuilder();
        for (String language : programmingLanguages) {
            if (text.contains(language)) {
                result.append(language).append(", ");
            }
        }

        if (result.length() > 0) {
            result.setLength(result.length() - 2);
            System.out.println("Extracted Programming Languages: " + result);
        } else {
            System.out.println("No programming languages found.");
        }
    }
}


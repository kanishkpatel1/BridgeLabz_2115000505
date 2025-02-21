import java.io.*;
import java.util.*;

public class Q10_WordCount {
    public static void main(String[] args) {
        String filePath = "input.txt";  

        Map<String, Integer> wordCountMap = new HashMap<>();
        int totalWords = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.toLowerCase().replaceAll("[^a-zA-Z ]", "").split("\\s+");
                for (String word : words) {
                    if (!word.isEmpty()) {
                        totalWords++;
                        wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
                    }
                }
            }

            System.out.println(" Total Words: " + totalWords);
            printTopWords(wordCountMap, 5);
        } catch (IOException e) {
            System.err.println(" Error reading file: " + e.getMessage());
        }
    }

    private static void printTopWords(Map<String, Integer> wordCountMap, int topN) {
        List<Map.Entry<String, Integer>> sortedWords = new ArrayList<>(wordCountMap.entrySet());
        sortedWords.sort((a, b) -> b.getValue().compareTo(a.getValue()));

        System.out.println("\n Top " + topN + " Most Frequent Words:");
        for (int i = 0; i < Math.min(topN, sortedWords.size()); i++) {
            Map.Entry<String, Integer> entry = sortedWords.get(i);
            System.out.println(entry.getKey() + " → " + entry.getValue() + " times");
        }
    }
}

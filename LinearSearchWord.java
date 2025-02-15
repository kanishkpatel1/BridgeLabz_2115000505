public class LinearSearchWord {
    public static void main(String[] args) {
        String[] sentences = {
            "The quick brown fox jumps over the lazy dog.",
            "Java is a popular programming language.",
            "Artificial Intelligence is shaping the future.",
            "Linear search is a simple search algorithm."
        };
        
        String wordToFind = "Java";
        String result = searchWordInSentences(sentences, wordToFind);
        System.out.println("Result: " + result);
    }
    
    public static String searchWordInSentences(String[] sentences, String word) {
        for (String sentence : sentences) {
            if (sentence.contains(word)) {
                return sentence;
            }
        }
        return "Not Found";
    }
}

import java.util.Random;
import java.util.Scanner;

public class Q1_NumberGuess {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lowerBound = 1;
        int upperBound = 100;
        boolean found = false;

        System.out.println("Think of a number between 1 and 100, and I will try to guess it!");

        while (!found) {
            int guess = generateGuess(lowerBound, upperBound);
            System.out.println("My guess is: " + guess);
            
            String feedback = getFeedback(scanner);
            
            if (feedback.equals("correct")) {
                found = true;
                System.out.println("I guessed it! The number is " + guess);
            } else if (feedback.equals("high")) {
                upperBound = guess - 1;
            } else if (feedback.equals("low")) {
                lowerBound = guess + 1;
            }
        }
        
        scanner.close();
    }
    
    public static int generateGuess(int lowerBound, int upperBound) {
        Random rand = new Random();
        return rand.nextInt(upperBound - lowerBound + 1) + lowerBound;
    }

    public static String getFeedback(Scanner scanner) {
        System.out.println("Is my guess too high, too low, or correct?");
        return scanner.nextLine().toLowerCase();
    }
}

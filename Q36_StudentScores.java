import java.util.*;

public class Q36_StudentScores {

    public static int[][] generateScores(int numStudents) {
        int[][] scores = new int[numStudents][3];

        for (int i = 0; i < numStudents; i++) {
            scores[i][0] = 50 + (int) (Math.random() * 51);
            scores[i][1] = 50 + (int) (Math.random() * 51);
            scores[i][2] = 50 + (int) (Math.random() * 51);
        }

        return scores;
    }

    public static double[][] calculateResults(int[][] scores) {
        double[][] results = new double[scores.length][4];

        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;

            results[i][0] = total;
            results[i][1] = Math.round(average * 100.0) / 100.0;
            results[i][2] = Math.round(percentage * 100.0) / 100.0;

            if (percentage >= 80) {
                System.out.println("Average marks is " + results[i][1] + " Grade is A and remarks is Level 4 above agency-normalized standards");
            } else if (percentage >= 70) {
                System.out.println("Average marks is " + results[i][1] + " Grade is B and remarks is Level 3, at agency-normalized standards");
            } else if (percentage >= 60) {
                System.out.println("Average marks is " + results[i][1] + " Grade is C and remarks is Level 2, below, but approaching agency-normalized standards");
            } else if (percentage >= 50) {
                System.out.println("Average marks is " + results[i][1] + " Grade is D and remarks is Level 1, well below agency-normalized standards");
            } else if (percentage >= 40) {
                System.out.println("Average marks is " + results[i][1] + " Grade is E and remarks is Level 1-, too below agency-normalized standards");
            } else {
                System.out.println("Average marks is " + results[i][1] + " Grade is R and remarks is Remedial standards");
            }
        }

        return results;
    }

    public static void displayScorecard(int[][] scores, double[][] results) {
        System.out.println("Student\tPhysics\tChemistry\tMath\tTotal\tAverage\tPercentage");

        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%d\t%d\t\t%d\t\t%d\t%.2f\t%.2f\t%.2f%%\n",
                    i + 1, scores[i][0], scores[i][1], scores[i][2], results[i][0], results[i][1], results[i][2]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int numStudents = scanner.nextInt();

        int[][] scores = generateScores(numStudents);
        double[][] results = calculateResults(scores);
        displayScorecard(scores, results);

        scanner.close();
    }
}

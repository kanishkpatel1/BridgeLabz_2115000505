import java.util.Scanner;

public class Q20_YoungestAndTallest {

    public static int findYoungest(int[] ages) {
        int youngest = ages[0];
        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < youngest) {
                youngest = ages[i];
            }
        }
        return youngest;
    }

    public static double findTallest(double[] heights) {
        double tallest = heights[0];
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > tallest) {
                tallest = heights[i];
            }
        }
        return tallest;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] ages = new int[3];
        double[] heights = new double[3];

        System.out.println("Enter age and height for the three friends:");

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age for friend " + (i + 1) + ": ");
            ages[i] = scanner.nextInt();
            System.out.print("Enter height for friend " + (i + 1) + ": ");
            heights[i] = scanner.nextDouble();
        }

        int youngest = findYoungest(ages);
        double tallest = findTallest(heights);

        System.out.println("The youngest friend is " + youngest + " years old.");
        System.out.println("The tallest friend is " + tallest + " meters tall.");

        scanner.close();
    }
}

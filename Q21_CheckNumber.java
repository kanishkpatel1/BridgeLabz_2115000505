import java.util.Scanner;

public class Q21_CheckNumber {

    public static String isPositive(int number) {
        if (number > 0) {
            return "positive";
        } else if (number < 0) {
            return "negative";
        } else {
            return "zero";
        }
    }

    public static String isEvenOrOdd(int number) {
        if (number % 2 == 0) {
            return "even";
        } else {
            return "odd";
        }
    }

    public static int compare(int num1, int num2) {
        if (num1 > num2) {
            return 1;
        } else if (num1 == num2) {
            return 0;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];

        System.out.println("Enter 5 numbers:");

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        for (int i = 0; i < numbers.length; i++) {
            int num = numbers[i];
            String result = isPositive(num);
            if ("positive".equals(result)) {
                String evenOddResult = isEvenOrOdd(num);
                System.out.println("Number " + num + " is positive and " + evenOddResult + ".");
            } else {
                System.out.println("Number " + num + " is negative.");
            }
        }

        int comparisonResult = compare(numbers[0], numbers[numbers.length - 1]);
        if (comparisonResult == 1) {
            System.out.println("First element is greater than last element.");
        } else if (comparisonResult == 0) {
            System.out.println("First element is equal to last element.");
        } else {
            System.out.println("First element is less than last element.");
        }

        scanner.close();
    }
}

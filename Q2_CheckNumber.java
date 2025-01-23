import java.util.Scanner;

public class Q2_CheckNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        for (int num : arr) {
            if (num > 0) {
                if (num % 2 == 0) {
                    System.out.println(num + " is positive and even.");
                } else {
                    System.out.println(num + " is positive and odd.");
                }
            } else if (num < 0) {
                System.out.println(num + " is negative.");
            } else {
                System.out.println(num + " is zero.");
            }
        }

        int first = arr[0];
        int last = arr[4];

        if (first == last) {
            System.out.println("first and last elements are equal");
        } else if (first > last) {
            System.out.println("first element is greater than the last element");
        } else {
            System.out.println("first element is less than the last element");
        }

        sc.close();
    }
}

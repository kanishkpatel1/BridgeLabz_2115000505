import java.util.*;
public class Q5_MultiplicationTable2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int[] multiplicationResult = new int[10];

        for (int i = 6; i <= 9; i++) {
            multiplicationResult[i] = number * i;
        }

        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + multiplicationResult[i]);
        }
    }
}

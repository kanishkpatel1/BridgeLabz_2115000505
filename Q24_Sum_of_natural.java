import java.util.*;
public class Q24_Sum_of_natural {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a natural number n: ");
        int n = sc.nextInt();
        
        if (n <= 0) {
            System.out.println("Please enter a positive number.");
            return;
        }
        
        int formulaSum = n * (n + 1) / 2;

        int loopSum = 0;
        int i = 1;
        while (i <= n) {
            loopSum += i;
            i++;
        }

        System.out.println("Sum using formula: " + formulaSum);
        System.out.println("Sum using while loop: " + loopSum);
        
        if (formulaSum == loopSum) {
            System.out.println("The result is correct");
        } else {
            System.out.println("There is an error");
        }
    } 
    
}

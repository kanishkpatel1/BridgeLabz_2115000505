import java.util.*;
public class Q25_Sum_natural_forloop {
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
        for (int i=1;i <= n;i++) {
            loopSum += i;
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

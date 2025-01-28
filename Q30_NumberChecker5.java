import java.util.*;
public class Q30_NumberChecker5 {
    


    static int[] findFactors(int n) {
        int count = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                factors[index++] = i;
            }
        }
        return factors;
    }

    static int greatestFactor(int n) {
        int[] factors = findFactors(n);
        return factors[factors.length - 1];
    }

    static int sumOfFactors(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }

    static int productOfFactors(int[] factors) {
        int product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }

    static double productOfCubesOfFactors(int[] factors) {
        double product = 1;
        for (int factor : factors) {
            product *= Math.pow(factor, 3);
        }
        return product;
    }

    static boolean isPerfectNumber(int n) {
        int[] factors = findFactors(n);
        int sum = sumOfFactors(factors);
        return sum == n;
    }

    static boolean isAbundantNumber(int n) {
        int[] factors = findFactors(n);
        int sum = sumOfFactors(factors);
        return sum > n;
    }

    static boolean isDeficientNumber(int n) {
        int[] factors = findFactors(n);
        int sum = sumOfFactors(factors);
        return sum < n;
    }

    static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    static boolean isStrongNumber(int n) {
        int sum = 0;
        int temp = n;
        while (temp > 0) {
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }
        return sum == n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        int[] factors = findFactors(n);

        System.out.println("Factors of " + n + ": " + Arrays.toString(factors));
        System.out.println("Greatest factor: " + greatestFactor(n));
        System.out.println("Sum of factors: " + sumOfFactors(factors));
        System.out.println("Product of factors: " + productOfFactors(factors));
        System.out.println("Product of cubes of factors: " + productOfCubesOfFactors(factors));
        System.out.println("Is Perfect Number: " + isPerfectNumber(n));
        System.out.println("Is Abundant Number: " + isAbundantNumber(n));
        System.out.println("Is Deficient Number: " + isDeficientNumber(n));
        System.out.println("Is Strong Number: " + isStrongNumber(n));
    }
}


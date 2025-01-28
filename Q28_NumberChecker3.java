import java.util.*;

public class Q28_NumberChecker3 {
    
    static int countDigit(int n) {
        int count = 0;
        while (n > 0) {
            count++;
            n /= 10;
        }
        return count;
    }

    static int[] digitArray(int n) {
        int t = countDigit(n);
        int[] arr = new int[t];
        while (n > 0) {
            arr[--t] = n % 10;
            n /= 10;
        }
        return arr;
    }

    static int digitSum(int arr[]) {
        int sum = 0;
        for (int d : arr) sum += d;
        return sum;
    }

    static int digitSumSquare(int arr[]) {
        int sum = 0;
        for (int d : arr) sum += Math.pow(d, 2);
        return sum;
    }

    static boolean checkHarshad(int n) {
        int digit = n;
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return (digit % sum == 0);
    }

    static int[] findFreq(int a[]) {
        int[] arr = new int[10];
        for (int d : a) {
            arr[d]++;
        }
        return arr;
    }

    static int[] reverseArray(int arr[]) {
        int[] reversed = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reversed[i] = arr[arr.length - 1 - i];
        }
        return reversed;
    }

    static boolean areArraysEqual(int arr1[], int arr2[]) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }

    static boolean isPalindrome(int n) {
        int[] digitArr = digitArray(n);
        int[] reversedArr = reverseArray(digitArr);
        return areArraysEqual(digitArr, reversedArr);
    }

    static boolean isDuckNumber(int n) {
        int[] digitArr = digitArray(n);
        for (int digit : digitArr) {
            if (digit != 0) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        
        int[] digitArr = digitArray(n);
        
        System.out.println("Digits in this number: " + countDigit(n));
        System.out.println("Digits array: " + Arrays.toString(digitArr));
        System.out.println("Check Harshad: " + checkHarshad(n));
        System.out.println("Sum of digits in digit array: " + digitSum(digitArr));
        System.out.println("Sum of squares of digits in digit array: " + digitSumSquare(digitArr));
        
        int[] freqArr = findFreq(digitArr);
        for (int i = 0; i < 10; i++) {
            if (freqArr[i] != 0) {
                System.out.println("Frequency of digit " + i + " is " + freqArr[i]);
            }
        }
        
        System.out.println("Is Palindrome: " + isPalindrome(n));
        System.out.println("Is Duck Number: " + isDuckNumber(n));
    }
}

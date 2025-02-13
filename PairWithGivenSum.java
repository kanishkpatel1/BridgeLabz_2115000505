 import java.util.*;

public class PairWithGivenSum {
    public static boolean hasPairWithSum(int[] arr, int target) {
        Set<Integer> seenNumbers = new HashSet<>();

        for (int num : arr) {
            int complement = target - num;
            if (seenNumbers.contains(complement)) {
                System.out.println("Pair found: (" + num + ", " + complement + ")");
                return true;
            }
            seenNumbers.add(num);
        }

        System.out.println("No pair found.");
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {10, 15, 3, 7};
        int target = 17;
        hasPairWithSum(arr, target);
    }
}
 

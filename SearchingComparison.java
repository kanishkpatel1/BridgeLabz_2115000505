import java.util.*;

public class SearchingComparison {

    public static void main(String[] args) {
        int N = 1_000_000;
        int searchValue = N / 2;

        int[] array = generateRandomArray(N);
        HashSet<Integer> hashSet = new HashSet<>();
        TreeSet<Integer> treeSet = new TreeSet<>();

        for (int num : array) {
            hashSet.add(num);
            treeSet.add(num);
        }

        long start = System.nanoTime();
        boolean foundInArray = linearSearch(array, searchValue);
        long end = System.nanoTime();
        System.out.println("Array Search Time: " + (end - start) / 1_000_000.0 + " ms (Found: " + foundInArray + ")");

        start = System.nanoTime();
        boolean foundInHashSet = hashSet.contains(searchValue);
        end = System.nanoTime();
        System.out.println("HashSet Search Time: " + (end - start) / 1_000_000.0 + " ms (Found: " + foundInHashSet + ")");

        start = System.nanoTime();
        boolean foundInTreeSet = treeSet.contains(searchValue);
        end = System.nanoTime();
        System.out.println("TreeSet Search Time: " + (end - start) / 1_000_000.0 + " ms (Found: " + foundInTreeSet + ")");
    }

    public static int[] generateRandomArray(int size) {
        Random rand = new Random();
        Set<Integer> set = new HashSet<>();
        while (set.size() < size) {
            set.add(rand.nextInt(size * 10));
        }
        int[] arr = new int[size];
        int i = 0;
        for (int num : set) {
            arr[i++] = num;
        }
        return arr;
    }

    public static boolean linearSearch(int[] arr, int target) {
        for (int num : arr) {
            if (num == target) {
                return true;
            }
        }
        return false;
    }
}

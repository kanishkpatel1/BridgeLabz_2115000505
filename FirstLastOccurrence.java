public class FirstLastOccurrence {
    
    public static int findFirstOccurrence(int[] arr, int target) {
        int left = 0, right = arr.length - 1, firstIndex = -1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (arr[mid] == target) {
                firstIndex = mid;
                right = mid - 1;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return firstIndex;
    }

    public static int findLastOccurrence(int[] arr, int target) {
        int left = 0, right = arr.length - 1, lastIndex = -1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (arr[mid] == target) {
                lastIndex = mid;
                left = mid + 1;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return lastIndex;
    }

    public static int[] findFirstAndLast(int[] arr, int target) {
        int first = findFirstOccurrence(arr, target);
        int last = findLastOccurrence(arr, target);
        return new int[]{first, last};
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 10, 10, 10, 18, 20};
        int target = 10;
        
        int[] result = findFirstAndLast(arr, target);
        System.out.println("First Occurrence: " + result[0] + ", Last Occurrence: " + result[1]);
    }
}

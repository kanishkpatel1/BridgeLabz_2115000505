import java.util.*;
public class BookPrices {
  public static void mergeSort(int[] arr, int start, int end) {
    if (start < end) {
      int mid = start + (end - start) / 2;
      mergeSort(arr, start, mid);
      mergeSort(arr, mid + 1, end);
      mergeTwoSortedArrays(arr, start, mid, end);
    }
  }
  public static void mergeTwoSortedArrays(int[] arr, int start, int mid, int end) {
    int n1 = mid - start + 1;
    int n2 = end - mid;

    int[] leftArr = new int[n1];
    int[] rightArr = new int[n2];

    System.arraycopy(arr, start, leftArr, 0, n1);
    System.arraycopy(arr, mid + 1, rightArr, 0, n2);

    int i = 0;
    int j = 0;
    int k = start;
    while (i < n1 && j < n2) {
      if (leftArr[i] <= rightArr[j]) {
        arr[k++] = leftArr[i++];
      } else {
        arr[k++] = rightArr[j++];
      }
    }

    while (i < n1) {
      arr[k++] = leftArr[i++];
    }

    while (j < n2) {
      arr[k++] = rightArr[j++];
    }
  }

  public static void main(String[] args) {
    int[] bookPrices = {999,399,249,199,344,129};
    mergeSort(bookPrices, 0, bookPrices.length - 1);
    System.out.println(Arrays.toString(bookPrices));
  }
}

import java.util.*;
public class StudentMarksSort {
  static void bubbleSort(int[] arr) {
    int n = arr.length - 1;
    for (int i = 0; i < n; i++) {
      boolean swap = false;
      for (int j = 0; j < n - i; j++) {
        if (arr[j] > arr[j + 1]) {
          int temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
          swap = true;
        }
      }
      if (swap == false) break;
    }
  }
  public static void main(String[] args) {
    int[] marks = {13,4,44,3,45,34,22};
    bubbleSort(marks);
    System.out.println(Arrays.toString(marks));
  }
}
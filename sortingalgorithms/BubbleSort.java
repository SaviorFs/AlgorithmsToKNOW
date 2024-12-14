import java.util.Arrays;

public class BubbleSort {

    // Bubble Sort method
    public static void bubbleSort(int[] arr) {
        int n = arr.length;

        // Outer loop for the number of passes
        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false; // Flag to check if a swap occurred

            // Inner loop for comparing adjacent elements
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j + 1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            // If no swaps were made in the inner loop, the array is already sorted
            if (!swapped) {
                break;
            }
        }
    }

    // Main method for testing
    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};

        System.out.println("Unsorted array: " + Arrays.toString(arr));

        bubbleSort(arr);

        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}

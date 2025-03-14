import java.util.Arrays;

public class MergeSort {

    // Main method to sort an array using Merge Sort
    public static void mergeSort(int[] array) {
        // Base case: if the array is of length 0 or 1, it is already sorted
        if (array.length <= 1) {
            return;
        }

        // Step 1: Divide the array into two halves
        int mid = array.length / 2;
        int[] leftHalf = Arrays.copyOfRange(array, 0, mid);
        int[] rightHalf = Arrays.copyOfRange(array, mid, array.length);

        // Step 2: Recursively sort both halves
        mergeSort(leftHalf);
        mergeSort(rightHalf);

        // Step 3: Merge the sorted halves
        merge(array, leftHalf, rightHalf);
    }

    // Helper method to merge two sorted arrays
    private static void merge(int[] array, int[] left, int[] right) {
        int leftIndex = 0, rightIndex = 0, arrayIndex = 0;

        // Step 4: Merge the two sorted arrays
        while (leftIndex < left.length && rightIndex < right.length) {
            if (left[leftIndex] <= right[rightIndex]) {
                array[arrayIndex++] = left[leftIndex++];
            } else {
                array[arrayIndex++] = right[rightIndex++];
            }
        }

        // Step 5: If there are remaining elements in left or right, add them
        while (leftIndex < left.length) {
            array[arrayIndex++] = left[leftIndex++];
        }
        while (rightIndex < right.length) {
            array[arrayIndex++] = right[rightIndex++];
        }
    }

    // Example usage
    public static void main(String[] args) {
        int[] array = {38, 27, 43, 3, 9, 82, 10};
        System.out.println("Original array: " + Arrays.toString(array));
        mergeSort(array);
        System.out.println("Sorted array: " + Arrays.toString(array));
    }
}
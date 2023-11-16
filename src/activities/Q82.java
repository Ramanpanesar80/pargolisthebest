package activities;
import java.util.*;
public class Q82 {

    public static void main(String[] args) {
        // Define an integer array containing only binary values (0 and 1)
        int[] arr = {0, 1, 0, 1, 0, 0, 1, 1, 0, 1};

        // Call the sortBinaryArray method to rearrange the binary array
        sortBinaryArray(arr);

        // Print the sorted binary array
        System.out.println(Arrays.toString(arr));
    }

    // Method to sort a binary array, moving all 0s to the left and 1s to the right
    public static void sortBinaryArray(int[] arr) {
        int left = 0; // Initialize a pointer for the left side of the array
        int right = arr.length - 1; // Initialize a pointer for the right side of the array

        while (left < right) {
            // Move the left pointer to the right until it encounters a 1
            while (arr[left] == 0 && left < right) {
                left++;
            }

            // Move the right pointer to the left until it encounters a 0
            while (arr[right] == 1 && left < right) {
                right--;
            }

            // Swap the values at the left and right positions
            if (left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }
        }
    }
}


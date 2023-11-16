package activities;
import java.util.Arrays;
public class Q83 {
	public static void main(String[] args) {
        // Define an integer array with both even and odd numbers
        int[] arr = {3, 2, 4, 6, 1, 8, 9, 7, 5, 10};

        // Call the sortBinaryArray method to rearrange the array
        sortBinaryArray(arr);

        // Print the sorted array
        System.out.println(Arrays.toString(arr));
    }

    // Method to sort an array, moving even numbers to the left and odd numbers to the right
    public static void sortBinaryArray(int[] arr) {
        int left = 0; // Initialize a pointer for the left side of the array
        int right = arr.length - 1; // Initialize a pointer for the right side of the array

        // Iterate through the array until the left pointer meets the right pointer
        while (left < right) {
            // Move the left pointer to the right until it encounters an odd number (not even)
            while (arr[left] % 2 == 0 && left < right) {
                left++;
            }

            // Move the right pointer to the left until it encounters an even number
            while (arr[right] % 2 != 0 && left < right) {
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

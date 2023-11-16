package activities;
import java.util.Arrays;
public class Q84 {
	public static void main(String[] args) {
        // Define an integer array
        int[] arr = {10, 7, 8, 9, 1, 5};

        // Call the replaceElements method to replace elements with the maximum to the right
        System.out.println(Arrays.toString(replaceElements(arr)));
    }

    // Method to replace each element with the maximum element to its right
    public static int[] replaceElements(int[] arr) {
        // Check if the array is empty or null, and return it as is
        if (arr == null || arr.length == 0) {
            return arr;
        }

        int max = arr[arr.length - 1]; // Initialize the maximum as the last element
        arr[arr.length - 1] = -1; // Replace the last element with -1

        // Iterate from the second-to-last element to the first element
        for (int i = arr.length - 2; i >= 0; i--) {
            int temp = arr[i]; // Store the current element in a temporary variable
            arr[i] = max; // Replace the current element with the maximum
            max = Math.max(max, temp); // Update the maximum if the temporary value is larger
        }

        return arr; // Return the modified array
    }
}

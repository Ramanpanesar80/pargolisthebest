package activities;
import java.util.Arrays;
public class Q65 {
	public static void main(String[] args) {
        // Define an integer array with some zeros
        int[] arr = {4, 3, 0, 7, 8, 1, 0, 5};
        
        // Print the original array
        System.out.println("Array before moving 0's to the end: " + Arrays.toString(arr));

        // Move the zeros to the end of the array and print the result
        moveZeroesToEnd(arr);
        System.out.println("Array after moving 0's to the end: " + Arrays.toString(arr));
    }

    // Method to move all occurrences of 0 to the end of the array
    public static void moveZeroesToEnd(int[] arr) {
        int left = 0; // Initialize the left pointer
        int right = arr.length - 1; // Initialize the right pointer

        while (left <= right) {
            if (arr[left] == 0) {
                // If the current element is 0, move it to the end of the array
                int temp = arr[left];
                for (int i = left; i < right; i++) {
                    arr[i] = arr[i + 1];
                }
                arr[right] = temp;
                right--;
            } else {
                // If the current element is not 0, move to the next element
                left++;
            }
        }
    }
}

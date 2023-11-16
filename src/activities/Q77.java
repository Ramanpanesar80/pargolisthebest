package activities;

public class Q77 {
	public static void main(String[] args) {
        // Define an integer array
        int[] arr = {1, 2, 3, 4, 5, 6, 7};

        // Call the rotateArrayClockwise method to rotate the array
        rotateArrayClockwise(arr);

        // Print the rotated array
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    // Method to rotate an array clockwise
    public static void rotateArrayClockwise(int[] arr) {
        int n = arr.length;

        // Check if the array has fewer than 2 elements, in which case there is no need to rotate
        if (n < 2) {
            return;
        }

        int last = arr[n - 1]; // Store the last element of the array

        // Use System.arraycopy to shift the elements one position to the right
        System.arraycopy(arr, 0, arr, 1, n - 1);

        arr[0] = last; // Set the first element to the previously stored last element
    }
}

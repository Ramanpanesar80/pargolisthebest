package activities;
import java.util.Arrays;
public class Q61 {
	public static void main(String[] args) {
        // Initialize an integer array
        int[] array = {10, 5, 100, 15, 99, 95, 50, 25};
        
        // Print the original array
        System.out.println("Original array: " + Arrays.toString(array));

        // Find and print the second smallest element in the array
        int secondSmallest = findSecondSmallest(array);
        System.out.println("Second smallest element: " + secondSmallest);
    }

    // Method to find the second smallest element in an integer array
    public static int findSecondSmallest(int[] array) {
        // Check if the input array is invalid (null or too small)
        if (array == null || array.length < 2) {
            throw new IllegalArgumentException("Invalid array");
        }

        // Initialize variables to track the minimum and second minimum elements
        int min = array[0]; // Assume the first element is the minimum
        int secondMin = Integer.MAX_VALUE; // Initialize the second minimum to a large value

        // Iterate through the array to find the minimum and second minimum elements
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                // If the current element is smaller than the current minimum,
                // update the second minimum to the current minimum and the minimum to the current element.
                secondMin = min;
                min = array[i];
            } else if (array[i] < secondMin && array[i] > min) {
                // If the current element is smaller than the current second minimum
                // but larger than the minimum, update the second minimum to the current element.
                secondMin = array[i];
            }
        }

        // Return the second smallest element found
        return secondMin;
    }
}

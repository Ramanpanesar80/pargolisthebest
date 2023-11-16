package activities;
import java.util.Arrays;
public class Q60 {
	public static void main(String[] args) {
        int[] array = {10, 5, 100, 15, 99, 95, 50, 25};
        System.out.println("Original array: " + Arrays.toString(array));

        int secondLargest = findSecondLargest(array);
        System.out.println("Second largest element: " + secondLargest);
    }

    // This method finds the second largest element in an integer array.
    public static int findSecondLargest(int[] array) {
        if (array == null || array.length < 2) {
            throw new IllegalArgumentException("Invalid array");
        }

        int max = array[0]; // Initialize the maximum element to the first element.
        int secondMax = Integer.MIN_VALUE; // Initialize the second maximum to the smallest possible value.

        // Iterate through the array to find the maximum and second maximum elements.
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                secondMax = max; // Update the second maximum when a new maximum is found.
                max = array[i]; // Update the maximum.
            } else if (array[i] > secondMax && array[i] < max) {
                secondMax = array[i]; // Update the second maximum if a new value is between the current max and second max.
            }
        }

        return secondMax; // Return the second maximum element.
    }
}

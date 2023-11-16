package activities;
import java.util.Arrays;
public class Q50 {
	public static void main(String[] args) {
        // Define an array of integers
        int[] array = {1, 2, 3, 4, 5};

        // Specify the target value to be removed
        int target = 3;

        // Display the original array
        System.out.println("Original array: " + Arrays.toString(array));

        // Display the target value
        System.out.println("Target value: " + target);

        // Remove the target value from the array
        array = removeElement(array, target);

        // Display the updated array after removal
        System.out.println("Updated array: " + Arrays.toString(array));
    }

    // A method to remove an element from the array
    public static int[] removeElement(int[] original, int target) {
        // Create a new array to store the updated elements
        int[] newArray = new int[original.length - 1];

        // Initialize a flag to track if the target element is found
        boolean found = false;

        // Iterate through the original array
        for (int i = 0, j = 0; i < original.length; i++) {
            // If the element does not match the target or the target has already been found, add it to the new array
            if (original[i] != target || found) {
                newArray[j] = original[i];
                j++;
            } else {
                // Set the found flag to true if the target is encountered for the first time
                found = true;
            }
        }

        // If the target element is not found, return the original array
        if (!found) {
            return original;
        }

        // Return the new array with the target element removed
        return newArray;
    }
}

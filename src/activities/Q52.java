package activities;
import java.util.Arrays;
public class Q52 {
	public static void main(String[] args) {
        // Define an original array of integers
        int[] originalArray = {1, 2, 3, 4, 5};

        // Insert a new element (7) at position 2 in the array
        int[] modifiedArray = insertElement(originalArray, 7, 2);

        // Display the original array
        System.out.println("Original array: " + Arrays.toString(originalArray));

        // Display the modified array after inserting the new element
        System.out.println("Modified array: " + Arrays.toString(modifiedArray));
    }

    // A method to insert an element into an array
    public static int[] insertElement(int[] array, int element, int position) {
        // Create a new array with one more element than the original array
        int[] newArray = new int[array.length + 1];

        // Iterate through the original array
        for (int i = 0; i < array.length; i++) {
            if (i < position) {
                // Copy elements before the specified position
                newArray[i] = array[i];
            } else if (i >= position) {
                // Shift elements after the specified position to the right
                newArray[i + 1] = array[i];
            }
        }

        // Insert the new element at the specified position
        newArray[position] = element;

        // Return the modified array
        return newArray;
    }
}

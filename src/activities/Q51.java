package activities;
import java.util.Arrays;
public class Q51 {
    public static void main(String[] args) {
        // Define an original array of integers
        int[] originalArray = {1, 2, 3, 4, 5};

        // Display the original array
        System.out.println("Original array: " + Arrays.toString(originalArray));

        // Copy the original array to a new array
        int[] copiedArray = copyArray(originalArray);

        // Display the copied array
        System.out.println("Copied array: " + Arrays.toString(copiedArray));
    }

    // A method to copy an array
    public static int[] copyArray(int[] originalArray) {
        // Create a new array with the same length as the original array
        int[] newArray = new int[originalArray.length];

        // Iterate through the original array and copy its elements to the new array
        for (int i = 0; i < originalArray.length; i++) {
            newArray[i] = originalArray[i];
        }

        // Return the copied array
        return newArray;
    }
}

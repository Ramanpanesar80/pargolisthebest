package activities;
import java.util.Arrays;
public class Q59 {
	public static void main(String[] args) {
        int[] array = {1, 2, 3, 2, 5, 6, 3, 7, 8, 6, 9, 10, 10};
        System.out.println("Original array: " + Arrays.toString(array));

        int[] uniqueArray = removeDuplicates(array);
        System.out.println("Array after removing duplicates: " + Arrays.toString(uniqueArray));
    }

    // This method removes duplicates from an integer array and returns a new array with unique elements.
    public static int[] removeDuplicates(int[] array) {
        if (array == null || array.length == 0) {
            return array; // If the input array is null or empty, return it as is.
        }

        int[] uniqueArray = new int[array.length]; // Create a new array to store unique elements.
        int uniqueCount = 0; // Initialize a count for unique elements.

        for (int i = 0; i < array.length; i++) {
            int num = array[i];
            if (!contains(uniqueArray, num, uniqueCount)) { // Check if the element is not already in the uniqueArray.
                uniqueArray[uniqueCount++] = num; // Add the unique element to the uniqueArray.
            }
        }

        return Arrays.copyOf(uniqueArray, uniqueCount); // Copy the unique elements to a new array of the correct size.
    }

    // This method checks if a given integer is present in an array.
    public static boolean contains(int[] array, int num, int uniqueCount) {
        for (int i = 0; i < uniqueCount; i++) {
            if (array[i] == num) {
                return true; // The element is already in the array, so it's not unique.
            }
        }
        return false; // The element is not found in the array, so it's unique.
    }
}
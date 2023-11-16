package activities;
import java.util.Arrays;
public class Q54 {
	 public static void main(String[] args) {
	        // Create an array of integers
	        int[] array = {1, 2, 3, 4, 5};
	        System.out.println("Original array: " + Arrays.toString(array));
	        
	        // Reverse the array and display the reversed array
	        int[] reversedArray = reverseArray(array);
	        System.out.println("Reversed array: " + Arrays.toString(reversedArray));
	    }

	    // Method to reverse an array of integers
	    public static int[] reverseArray(int[] array) {
	        int start = 0;
	        int end = array.length - 1;

	        // Use a while loop to reverse the array elements
	        while (start < end) {
	            // Swap the elements at the start and end positions
	            int temp = array[start];
	            array[start] = array[end];
	            array[end] = temp;

	            // Move the start and end positions towards the center of the array
	            start++;
	            end--;
	        }

	        // Return the reversed array
	        return array;
	    }
}

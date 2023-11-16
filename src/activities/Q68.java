package activities;
import java.util.Arrays;
public class Q68 {
	 public static void main(String[] args) {
	        // Define an integer array
	        int[] arr = {4, 3, 0, 7, 8, 1, 0, 5};

	        // Check if the array has less than 3 elements
	        if (arr.length < 3) {
	            System.out.println("Error: Array length must be at least 3.");
	            return;
	        }

	        // Sort the array in ascending order
	        Arrays.sort(arr);

	        // Initialize a variable to store the sum
	        int sum = 0;

	        // Iterate through the array, excluding the first and last elements
	        for (int i = 1; i < arr.length - 1; i++) {
	            sum += arr[i];
	        }

	        // Calculate the average of the elements, excluding the largest and smallest values
	        double average = (double) sum / (arr.length - 2);

	        // Print the average value
	        System.out.println("The average value of the array, except the largest and smallest values, is: " + average);
	    }
}

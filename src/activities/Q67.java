package activities;
import java.util.Arrays;
public class Q67 {
	public static void main(String[] args) {
        // Define an integer array
        int[] arr = {4, 3, 0, 7, 8, 1, 0, 5};
        
        // Check if the array is empty
        if (arr.length < 1) {
            System.out.println("Error: Array length must be at least 1.");
            return;
        }

        // Sort the array in ascending order
        Arrays.sort(arr);

        // Find the minimum and maximum values in the array
        int min = arr[0]; // Minimum value is the first element
        int max = arr[arr.length - 1]; // Maximum value is the last element

        // Calculate the difference between the largest and smallest values
        int difference = max - min;

        // Print the difference between the largest and smallest values in the array
        System.out.println("The difference between the largest and smallest values in the array is: " + difference);
    }
}

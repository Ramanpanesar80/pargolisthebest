package activities;
import java.util.Arrays;
public class Q64 {
	  public static void main(String[] args) {
	        // Define an integer array with a missing number
	        int[] arr = {4, 3, 2, 7, 8, 1, 5};

	        // Find and print the missing number in the array
	        System.out.println("Missing number: " + findMissingNumber(arr));
	    }

	    // Method to find the missing number in a sorted integer array
	    public static int findMissingNumber(int[] arr) {
	        // Sort the input array in ascending order
	        Arrays.sort(arr);

	        int left = 0;
	        int right = arr.length - 1;

	        // Use binary search to find the missing number
	        while (left <= right) {
	            int mid = left + (right - left) / 2;

	            if (arr[mid] > mid + 1) {
	                // If the element at the current position is greater than its expected value,
	                // move the search range to the left half of the array.
	                right = mid - 1;
	            } else {
	                // Otherwise, move the search range to the right half of the array.
	                left = mid + 1;
	            }
	        }

	        // The left variable will contain the missing number
	        return left;
	    }
}

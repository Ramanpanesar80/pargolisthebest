package activities;
public class Q71 {
	 public static void main(String[] args) {
	        // Define an integer array
	        int[] arr = {4, 3, 65, 7, 8, 65, 1, 0, 5};

	        // Call the checkElements method to check if both 65 and 77 exist in the array
	        System.out.println(checkElements(arr, 65, 77));
	    }

	    // Method to check if two specific elements exist in the array
	    public static boolean checkElements(int[] arr, int x, int y) {
	        int count = 0; // Initialize a counter to keep track of how many times x or y appears in the array

	        // Iterate through the elements in the array
	        for (int num : arr) {
	            // Check if the current element is equal to either x or y
	            if (num == x || num == y) {
	                count++; // Increment the count if a match is found
	            }
	        }

	        // Check if both x and y were found exactly two times in the array and return true if so
	        return count == 2;
	    }	
}

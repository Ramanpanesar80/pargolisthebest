package activities;
import java.util.Arrays;
public class Q55 {
	 public static void main(String[] args) {
	        // Create an array of integers with possible duplicates
	        int[] array = {1, 2, 3, 4, 5, 2, 4, 6};
	        System.out.println("Original array: " + Arrays.toString(array));

	        // Find and display duplicate values from the array
	        int[] duplicateValues = findDuplicates(array);
	        System.out.println("Duplicate values: " + Arrays.toString(duplicateValues));
	    }

	    // Method to find duplicate values in an integer array
	    public static int[] findDuplicates(int[] array) {
	        // Create a HashSet to store unique values
	        java.util.HashSet<Integer> set = new java.util.HashSet<>();
	        // Create an ArrayList to store duplicate values
	        java.util.ArrayList<Integer> list = new java.util.ArrayList<>();

	        // Iterate through the array
	        for (int i : array) {
	            // If the value is not added to the HashSet, it's a duplicate and is added to the ArrayList
	            if (!set.add(i)) {
	                list.add(i);
	            }
	        }

	        // Convert the ArrayList of duplicate values to an integer array
	        int[] duplicates = new int[list.size()];
	        for (int i = 0; i < list.size(); i++) {
	            duplicates[i] = list.get(i);
	        }

	        // Return the array of duplicate values
	        return duplicates;
	    }
	}
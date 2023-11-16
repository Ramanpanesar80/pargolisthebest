package activities;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
public class Q56 {
	 public static void main(String[] args) {
	        // Create an array of strings with possible duplicates
	        String[] array = {"Apple", "Banana", "Cherry", "Apple", "Banana", "Durian"};
	        System.out.println("Original array: " + Arrays.toString(array));

	        // Find and display duplicate values from the array
	        String[] duplicateValues = findDuplicates(array);
	        System.out.println("Duplicate values: " + Arrays.toString(duplicateValues));
	    }

	    // Method to find duplicate strings in an array
	    public static String[] findDuplicates(String[] array) {
	        // Create a HashSet to store unique strings
	        Set<String> set = new HashSet<>();
	        // Create a HashSet to store duplicate strings
	        Set<String> duplicates = new HashSet<>();

	        // Iterate through the array of strings
	        for (String str : array) {
	            // If the string is not added to the HashSet, it's a duplicate and is added to the duplicates HashSet
	            if (!set.add(str)) {
	                duplicates.add(str);
	            }
	        }

	        // Convert the HashSet of duplicate strings to a string array
	        String[] result = new String[duplicates.size()];
	        duplicates.toArray(result);

	        // Return the array of duplicate strings
	        return result;
	    }
}

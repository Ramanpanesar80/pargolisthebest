package activities;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
public class Q58 {
	 public static void main(String[] args) {
	        int[] array1 = {1, 2, 3, 4, 5};
	        int[] array2 = {4, 5, 6, 7, 8};
	        System.out.println("Common elements: " + Arrays.toString(findCommonElements(array1, array2)));
	    }

	    // This method finds the common elements between two integer arrays.
	    public static int[] findCommonElements(int[] array1, int[] array2) {
	        // Create two sets to store elements from the arrays.
	        Set<Integer> set1 = new HashSet<>();
	        Set<Integer> set2 = new HashSet<>();

	        // Add elements from array1 to set1.
	        for (int i : array1) {
	            set1.add(i);
	        }

	        // Add elements from array2 to set2.
	        for (int i : array2) {
	            set2.add(i);
	        }

	        // Find the common elements by retaining only those in set1 that are also in set2.
	        set1.retainAll(set2);

	        // Convert the set of common elements back to an array.
	        int[] commonElements = new int[set1.size()];
	        int i = 0;
	        for (int element : set1) {
	            commonElements[i++] = element;
	        }

	        return commonElements;
	    }
}

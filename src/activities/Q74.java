package activities;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
public class Q74 {
	public static void main(String[] args) {
        // Define an integer array and a target value
        int[] arr = {1, 2, 4, 5, 6};
        int target = 6;

        // Call the findSumPair method to find a pair of elements that sum to the target value
        int[] result = findSumPair(arr, target);

        // Check if a valid result was found and print the appropriate message
        if (result.length > 0) {
            System.out.println("The two elements that sum to the target value are: " + result[0] + " and " + result[1]);
        } else {
            System.out.println("No two elements sum to the target value.");
        }
    }

    // Method to find a pair of elements that sum to the target value
    public static int[] findSumPair(int[] arr, int target) {
        // Create a HashMap to store elements and their indices
        Map<Integer, Integer> map = new HashMap<>();

        // Iterate through the array
        for (int i = 0; i < arr.length; i++) {
            int complement = target - arr[i]; // Calculate the complement for the current element

            if (map.containsKey(complement)) {
                // If the complement is found in the map, return the pair of elements
                return new int[]{complement, arr[i]};
            }

            map.put(arr[i], i); // Store the current element and its index in the map
        }

        // If no valid pair is found, return an empty array
        return new int[]{};
    }
}

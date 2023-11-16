package activities;
import java.util.HashSet;
import java.util.Set;
public class Q73 {
	public static void main(String[] args) {
        // Define an integer array
        int[] arr = {49, 1, 3, 200, 2, 4, 70, 5};

        // Calculate and print the length of the longest consecutive elements sequence in the array
        System.out.println("Length of the longest consecutive elements sequence: " + longestConsecutive(arr));
    }

    // Method to find the length of the longest consecutive elements sequence
    public static int longestConsecutive(int[] nums) {
        // Create a set to store unique elements from the input array
        Set<Integer> set = new HashSet<>();
        int maxLength = 0; // Initialize a variable to store the maximum length of the sequence

        // Add elements from the input array to the set
        for (int num : nums) {
            set.add(num);
        }

        // Iterate through the elements in the set
        for (int num : set) {
            if (!set.contains(num - 1)) {
                // If the current element is the start of a potential sequence
                int currentNum = num;
                int currentLength = 1; // Initialize the length of the current sequence

                // Continue counting consecutive elements in the sequence
                while (set.contains(currentNum + 1)) {
                    currentNum += 1;
                    currentLength += 1;
                }

                // Update the maximum length if the current sequence is longer
                maxLength = Math.max(maxLength, currentLength);
            }
        }
        return maxLength;
        // Return the length of the longest consecutive sequence found
    }    
}

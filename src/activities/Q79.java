package activities;
import java.util.Arrays;
public class Q79 {
	public static void main(String[] args) {
        // Define an integer array containing both positive and negative numbers
        int[] arr = {12, -13, -5, 6, -15};

        // Call the separateNegativePositive method to rearrange the array
        separateNegativePositive(arr);

        // Print the modified array
        System.out.println(Arrays.toString(arr));
    }

    // Method to separate negative and positive numbers in the array
    public static void separateNegativePositive(int[] arr) {
        int n = arr.length;

        // Create separate arrays to hold negative and positive numbers
        int[] negative = new int[n];
        int[] positive = new int[n];
        int negCount = 0; // Count of negative numbers
        int posCount = 0; // Count of positive numbers

        // Iterate through the original array and separate numbers based on their sign
        for (int num : arr) {
            if (num < 0) {
                // Add negative numbers to the 'negative' array
                negative[negCount++] = num;
            } else {
                // Add positive numbers to the 'positive' array
                positive[posCount++] = num;
            }
        }

        // Copy negative numbers back to the original array
        for (int i = 0; i < negCount; i++) {
            arr[i] = negative[i];
        }

        // Copy positive numbers after the negative numbers in the original array
        for (int i = 0; i < posCount; i++) {
            arr[negCount + i] = positive[i];
        }
    }
}

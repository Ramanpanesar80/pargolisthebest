package activities;
import java.util.Arrays;
public class Q76 {
	public static void main(String[] args) {
        // Define an integer array representing the lengths of line segments
        int[] arr = {1, 2, 3, 4, 5};

        // Calculate and print the number of possible triangles that can be formed
        System.out.println("Number of possible triangles: " + countTriangles(arr));
    }

    // Method to count the number of possible triangles that can be formed
    public static int countTriangles(int[] arr) {
        int n = arr.length;

        // If there are less than 3 elements in the array, no triangles can be formed
        if (n < 3) {
            return 0;
        }

        // Sort the array in ascending order for easier triangle validation
        Arrays.sort(arr);

        int count = 0; // Initialize a variable to count the possible triangles

        // Iterate through the array to find valid combinations of line segments
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    // Check if the combination of line segments forms a valid triangle
                    if (arr[i] + arr[j] > arr[k]) {
                        count++; // Increment the count if a valid triangle is found
                    }
                }
            }
        }

        // Return the count of possible triangles
        return count;
    }
}

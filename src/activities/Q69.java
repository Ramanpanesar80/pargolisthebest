package activities;
public class Q69 {
	public static void main(String[] args) {
        // Define an integer array
        int[] arr = {4, 3, 0, 7, 8, 1, 0, 5};

        // Check if the array contains both 0 and -1
        if (isWithoutZeroAndMinusOne(arr)) {
            System.out.println("The array is without 0 and -1.");
        } else {
            System.out.println("The array is not without 0 and -1.");
        }
    }

    // Method to check if an array contains both 0 and -1
    public static boolean isWithoutZeroAndMinusOne(int[] arr) {
        // Iterate through the elements in the array
        for (int num : arr) {
            // Check if the current element is 0 or -1
            if (num == 0 || num == -1) {
                // If either 0 or -1 is found, return false
                return false;
            }
        }
        // If neither 0 nor -1 is found, return true
        return true;
    }
}

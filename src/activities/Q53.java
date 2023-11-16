package activities;

public class Q53 {
    public static void main(String[] args) {
        // Create an array of integers
        int[] array = {12, 23, 3, 14, 5};
        
        // Find and display the minimum value in the array
        int min = findMin(array);
        System.out.println("Minimum value: " + min);
        
        // Find and display the maximum value in the array
        int max = findMax(array);
        System.out.println("Maximum value: " + max);
    }

    // Method to find the minimum value in an array
    public static int findMin(int[] array) {
        // Initialize the minimum value with the first element of the array
        int min = array[0];
        
        // Iterate through the array to find the minimum value
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        
        // Return the minimum value
        return min;
    }

    // Method to find the maximum value in an array
    public static int findMax(int[] array) {
        // Initialize the maximum value with the first element of the array
        int max = array[0];
        
        // Iterate through the array to find the maximum value
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        
        // Return the maximum value
        return max;
    }

}

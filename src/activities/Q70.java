package activities;
public class Q70 {
	public static void main(String[] args) {
        // Define an integer array
        int[] arr = {4, 3, 10, 7, 8, 10, 1, 0, 5};

        // Call the checkSum method and print the result
        System.out.println(checkSum(arr));
    }

    // Method to check if the sum of elements divisible by 10 in an array equals 30
    public static boolean checkSum(int[] arr) {
        int sum = 0; // Initialize a variable to store the sum

        // Iterate through the elements in the array
        for (int num : arr) {
            // Check if the current element is divisible by 10
            if (num % 10 == 0) {
                sum += num; // Add the current element to the sum
            }
        }

        // Check if the sum equals 30 and return true if it does
        return sum == 30;
    }
}

package activities;
public class Q66 {
	 public static void main(String[] args) {
	        // Define an integer array
	        int[] arr = {4, 3, 0, 7, 8, 1, 0, 5};
	        
	        // Initialize counters for even and odd numbers
	        int evenCount = 0;
	        int oddCount = 0;

	        // Iterate through the array to count even and odd numbers
	        for (int i = 0; i < arr.length; i++) {
	            int num = arr[i];
	            // Use a switch statement to determine whether the current number is even or odd
	            switch (num % 2) {
	                case 0:
	                    evenCount++; // If the number is even, increment the evenCount
	                    break;
	                case 1:
	                    oddCount++; // If the number is odd, increment the oddCount
	                    break;
	            }
	        }

	        // Print the counts of even and odd integers
	        System.out.println("Number of even integers: " + evenCount);
	        System.out.println("Number of odd integers: " + oddCount);
	    }
}

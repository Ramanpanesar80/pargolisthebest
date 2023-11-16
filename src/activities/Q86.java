package activities;
import java.util.Scanner;
public class Q86 {
	 public static void main(String[] args) {
	        // Create a Scanner object for user input
	        Scanner scanner = new Scanner(System.in);

	        // Prompt the user to input the number of terms
	        System.out.println("Input the number of terms : ");

	        // Read the user's input as an integer
	        int n = scanner.nextInt();

	        // Close the Scanner to release resources
	        scanner.close();

	        int sum = 0; // Initialize a variable to store the sum of numbers

	        for (int i = 1; i <= n; i++) {
	            // Generate a string of 'i' ones and convert it to an integer
	            int currentNumber = Integer.parseInt(new String(new char[i]).replace("\0", "1"));

	            // Add the current number to the sum
	            sum += currentNumber;
	        }

	        // Display the series pattern
	        System.out.println("1 + 11 + 111 + 1111 + 11111 + ... 1" + new String(new char[n]).replace("\0", "1") + " + ");

	        // Display the sum of the series
	        System.out.println("The Sum is : " + sum);
	    }
}

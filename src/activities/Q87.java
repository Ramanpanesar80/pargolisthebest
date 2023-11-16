package activities;
import java.util.Scanner;
public class Q87 {
	 public static void main(String[] args) {
	        // Create a Scanner object for user input
	        Scanner scanner = new Scanner(System.in);

	        // Prompt the user to input the number of elements
	        System.out.println("Input the number of elements : ");

	        // Read the user's input as an integer
	        int n = scanner.nextInt();

	        // Prompt the user to input 'n' numbers
	        System.out.println("Input " + n + " numbers : ");

	        int sum = 0; // Initialize a variable to store the sum of numbers

	        // Iterate 'n' times to read and sum 'n' numbers
	        for (int i = 0; i < n; i++) {
	            int num = scanner.nextInt(); // Read a number from the user
	            sum += num; // Add the number to the sum
	        }

	        // Calculate the average by dividing the sum by 'n', ensuring a double result
	        double average = (double) sum / n;

	        // Display the sum and average of the numbers
	        System.out.println("The sum is : " + sum);
	        System.out.println("The average is : " + average);

	        // Close the Scanner to release resources
	        scanner.close();
	    }
}

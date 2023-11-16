package activities;
import java.util.Scanner;
public class Q85 {
	  public static void main(String[] args) {
	        // Create a Scanner object for user input
	        Scanner scanner = new Scanner(System.in);

	        // Prompt the user to input the number of terms
	        System.out.println("Input number of terms : ");

	        // Read the user's input as an integer
	        int n = scanner.nextInt();

	        // Close the Scanner to release resources
	        scanner.close();

	        // Iterate from 1 to 'n' to calculate and display cubes
	        for (int i = 1; i <= n; i++) {
	            // Display the number and its cube
	            System.out.println("Number is : " + i + " and cube of the " + i + " is :" + i * i * i);
	        }
	    }
}

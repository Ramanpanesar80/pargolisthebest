package activities;
import java.util.Scanner;
public class Q89 {
	public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to input a number for the multiplication table
        System.out.println("Input the number (Table to be calculated) : ");
        
        // Read the user's input as an integer
        int number = scanner.nextInt();

        // Display a message indicating the multiplication table to be calculated
        System.out.println("The multiplication table for " + number + " is:");

        // Use a for loop to calculate and display the multiplication table up to 10
        for (int i = 1; i <= 10; i++) {
            // Calculate and display each multiplication row
            System.out.println(number + " X " + i + " = " + (number * i));
        }

        // Close the Scanner to release resources
        scanner.close();
    }
}

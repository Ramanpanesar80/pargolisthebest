package activities;
import java.util.Scanner;
public class Q88 {
	public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to input a grade
        System.out.println("Input the grade :");

        // Read the user's input as a character
        char grade = scanner.next().charAt(0);

        String description = ""; // Initialize a variable to store the grade description

        // Use a switch statement to determine the description based on the grade
        switch (grade) {
            case 'E':
            case 'e':
                description = "Excellent";
                break;
            case 'V':
            case 'v':
                description = "Very Good";
                break;
            case 'G':
            case 'g':
                description = "Good";
                break;
            case 'A':
            case 'a':
                description = "Average";
                break;
            case 'F':
            case 'f':
                description = "Fail";
                break;
            default:
                // Handle an invalid grade input
                System.out.println("Invalid input!");
                return;
        }

        // Display the chosen grade description
        System.out.println("You have chosen : " + description);

        // Close the Scanner to release resources
        scanner.close();
    }
}

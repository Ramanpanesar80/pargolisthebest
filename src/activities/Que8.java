package activities;
import java.util.*;
public class Que8 {
public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter a number: ");
	        double number = scanner.nextDouble();

	        if (number < 0) {
	            System.out.println("Square root is undefined for negative numbers.");
	        } else {
	            double squareRoot = Math.sqrt(number);
	            System.out.println("Square root of " + number + " is " + squareRoot);
	        }

	        scanner.close();
	    
	}

}

package activities;

import java.util.Scanner;

public class Que10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter a number: ");
	        double number = scanner.nextDouble();
	        
	        if(number>0) {
	        	System.out.print("It is a positive num");
	        }
	        else if(number<0) {
	        	System.out.print("It is a negative num");
	        }
	        else {
	        	System.out.print("The number is Zero");
	        }
	}

}

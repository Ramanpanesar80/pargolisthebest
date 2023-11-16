package activities;
import java.util.Scanner;
public class Que9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner scanner = new Scanner(System.in);
		  
	        System.out.print("Enter your age : ");
	        int age = scanner.nextInt();
	        
	        if(age>18) {
	        	System.out.print("You are eligible to vote!");
	        }
	        else {
	        	System.out.print("You are not eligible to vote!");
	        }
		
	}

}

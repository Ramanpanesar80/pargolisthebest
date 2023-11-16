package activities;

import java.util.Scanner;

public class Que24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner kb = new Scanner(System.in);
		
		System.out.print("Enter your Num : ");
		n = kb.nextInt();
		
		if(n>0) {
			System.out.print("The number is positive");
		}
		else if(n<0) {
			System.out.print("The number is negative");
		}
		else {
			System.out.print("The number is Zero");
			
			kb.close();
			
			
		}

	}

}

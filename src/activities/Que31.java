package activities;

import java.util.Scanner;

public class Que31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//factorial using while loop
		int i=1, N;
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter the number for the factorial : ");
		N = kb.nextInt();
		
		
		
		System.out.println(factorial(N));

	}
	
	
	public static int factorial(int i) {
		int fact = 1;
		int n = 1;
		while(n<=i) {
			fact = fact * n;
			n++;
		}
		return fact;
		
	}
	

}

package activities;

import java.util.*;

public class Que39 {

	public static void main(String[] args) {
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

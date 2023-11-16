package activities;

import java.util.Scanner;

public class Que41 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = kb.nextInt();
		int r = 0; int sum = 0;
		do { r = num % 10;
		r = (r*10) + r;
		sum = sum + r;
		num = num / 10;
			
			
		}
		while(num > 0);
	
	System.out.println(r);

	}
}

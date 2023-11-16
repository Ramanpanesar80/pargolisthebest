package activities;

import java.util.Scanner;

public class Que19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner kb = new Scanner(System.in);
		
		System.out.print("Enter your Num : ");
		n = kb.nextInt();
		
		if(n>0 && n % 2 == 0) {
			System.out.print("The number is positive and even");
		}
		else {
			System.out.print("Enter some other number");
		}

	}

}

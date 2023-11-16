package activities;

import java.util.Scanner;

public class Que21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// multiple of 3 and 5
		int n1;
		Scanner kb = new Scanner(System.in);

		System.out.print("Enter your Num : ");
		n1 = kb.nextInt();
		
		if(n1 %3 == 0 && n1 % 5 == 0) {
			System.out.print("The num is multiple of 3 and 5");
		}
		else {
			System.out.print("The num is not multiple of 3 an 5");
		}

	}

}

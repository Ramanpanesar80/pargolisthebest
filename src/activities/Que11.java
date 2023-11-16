package activities;

import java.util.Scanner;

public class Que11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1, n2, n3, n4;
		Scanner kb = new Scanner(System.in);

		System.out.print("Enter your Num1 : ");
		n1 = kb.nextInt();

		System.out.print("Enter your Num2 : ");
		n2 = kb.nextInt();

		System.out.print("Enter your Num3 : ");
		n3 = kb.nextInt();

		if(n1>n2 && n1>n3 ) {
			System.out.print("Num1 is the greatest");
		}
		
		else if(n2>n1 && n2>n3) {
			System.out.print("Num2 is the greatest");
		}
		
		else {
			System.out.print("Num3 is the greatest");
		}
		kb.close();
	}

}
























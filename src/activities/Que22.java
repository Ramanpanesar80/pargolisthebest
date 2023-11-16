package activities;

import java.util.Scanner;

public class Que22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double num1, num2, num3;
		Scanner kb = new Scanner(System.in);
		
		System.out.print("Enter the amount for 1st item ");
		num1 = kb.nextDouble();
		
		System.out.print("Enter the amount for 1st item ");
		num2 = kb.nextDouble();
		
		System.out.print("Enter the amount for 1st item ");
		num3 = kb.nextDouble();
		
		double delta = (num2 * num2) - (4* num1* num3);
		
		if(delta>0) {
			double root1 = (-num2 + Math.sqrt(delta))/(2*num1);
			double root2 = (-num2 + Math.sqrt(delta))/(2*num1);
			System.out.print("The root is  " + root1);
			System.out.print("The root is "+ root2);
		}
		else if(delta<0) {
			double root = (num2 + Math.sqrt(delta));
			//look for the formula
			System.out.print("The root is:  " + root);
		}
		
		else {
			System.out.print("There is no root.");
		}

	}

}

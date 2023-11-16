package activities;

import java.util.Scanner;

public class Que43 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		double num;
		System.out.println("Enter a num for square");
		num = kb.nextDouble();
		do {
			num = num*num;
			System.out.println(num);
			break;
		}
		while(num>=0);

	}

}

package activities;

import java.util.Scanner;

//ODD EVEN
public class Que1 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);

		System.out.print("Enter the Number");
		int num = kb.nextInt();
		if (num % 2 == 0) 
		//can also use condition(num % 2 !=0)
		{
			System.out.print("Its an even number");
		}

		else {
			System.out.print("Its an odd number");
		}

	}

}

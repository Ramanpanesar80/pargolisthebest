package activities;

import java.util.Scanner;

public class Que28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int monthNum;
		Scanner kb = new Scanner(System.in);
		System.out.println("Please give me the num of month");
		monthNum = kb.nextInt();
		int mycas = 0;
		
		if (monthNum == 1 || monthNum == 3 || monthNum == 5 || monthNum == 7 || monthNum == 8 || monthNum == 10
				|| monthNum == 12) {
			mycas = 1;
		}
		else if (monthNum == 4 || monthNum == 6 || monthNum == 9 || monthNum == 10 || monthNum == 11) {
			mycas = 2;
		}
		
		else if (monthNum == 2) {
			mycas = 3;
		}
		
		else {
			System.out.println("Enter a valid month");
		}
		
		
		
		switch (mycas) {
		case 1:
			System.out.print("This month has 31days");
			break;

		case 2:
				System.out.print("This month has 30days");
				break;
		case 3:
			
				System.out.print("This month has 28 days");
				break;
			
		}
		System.out.println();

		kb.close();

	}

}

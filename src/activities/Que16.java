package activities;

import java.util.Scanner;

public class Que16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//perfect square
		int num;
		Scanner kb = new Scanner(System.in);
		
		System.out.print("Enter your Num : ");
		num = kb.nextInt();
		
		int sqr = (int) Math.sqrt(num);
		
		if(sqr * sqr == num) {
			System.out.print(num + " is a perfect square");
		}
		else {
			System.out.print(num + "is not a perfect square");
		}
	}
	

}

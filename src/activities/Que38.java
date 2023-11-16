package activities;

import java.util.Scanner;

public class Que38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = kb.nextInt();
		int n;
		do {
			n = num + (num+1);
			n++;
			num++;
			System.out.println(n);
			
		}
		while(n<=num);
		

	}

}

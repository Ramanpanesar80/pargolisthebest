package activities;

import java.util.Scanner;

public class Que40 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter a range");
		int n = kb.nextInt();
		int a=1;
		int b=0;
		int c = 1;
		do {
				c = a + b;
				a = b;
				b = c;
				System.out.println(c);
		}
		while (c <= n);
		System.out.println();
		kb.close();

	}

}

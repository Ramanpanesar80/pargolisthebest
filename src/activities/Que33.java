package activities;

import java.util.Scanner;

public class Que33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter num1");
		int a = kb.nextInt();
		System.out.print("Enter num2");
		int b = kb.nextInt();
		int n=0;
		
		while(a!=b) {
			n=a;
			a=b;
			b=n;
		}
		System.out.println(a);
		System.out.println(b);

	}

}

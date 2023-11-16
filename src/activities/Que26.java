package activities;
import java.util.Scanner;
public class Que26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		int tamount, per, discount,amount1, amount2, final1;
		
		System.out.print("Enter the amount for 1st item ");
		amount1 = kb.nextInt();
		
		System.out.print("Enter the amount for 2nd item ");
		amount2 = kb.nextInt();
		
		System.out.print("Enter the Discount in % ");
		per = kb.nextInt();
		
		tamount = amount1 + amount2;
		System.out.println("The total amount is :" + tamount);

	
		discount = (per* tamount)/100;
		System.out.println("The discount is :" + discount );

		
		final1 = tamount - discount;
		System.out.println("The Final amount is :" + final1);

	
	}

}

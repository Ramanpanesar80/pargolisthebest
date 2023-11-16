package activities;
import java.util.*;
public class Que42 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		double num;
		System.out.println("Enter a num for squareroot");
		num = kb.nextDouble();
		double root = 0;
		do {
			root = Math.sqrt(num);
			System.out.println(root);
			break;
		}
		
		while(num>0);
		
		
		kb.close();

	}

}

package activities;
import java.util.*;
public class Que7 {

	public static void main(String[] args) {
		//Prime number
		int num;
		Scanner kb= new Scanner(System.in);
		System.out.print("Enter a number ");
		num = kb.nextInt();
		
		if (num % num ==0) {
			System.out.print("It is a primr number");
		}

		else {
			System.out.print("It is not a prime number");
		}
	}

}

package activities;
import java.util.Scanner;
public class Que5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//absolute value
		Scanner kb = new Scanner(System.in);
		int num;
		System.out.print("Enter any number for absolute value");
		num = kb.nextInt();
		
		if(num>0) {
			System.out.println(num);
		}
		else {
			System.out.println(num* (-1));
		}
		
		kb.close();
		
	}

}

package activities;
import java.util.Scanner;
public class Que3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 Scanner kb = new Scanner(System.in);
	 int num1, num2;
	 System.out.print("Enter the first number : ");
	 num1 = kb.nextInt();
	 System.out.print("Enter the second number : ");
	 num2 = kb.nextInt();
	 
	if(num1> num2) {
		System.out.print("Num1 is greater");
	}
	
	else {
		System.out.print("Num2 is greter");
	}
	}

}

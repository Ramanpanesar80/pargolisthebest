package activities;
import java.util.Scanner;
public class Que23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int weekNum;
		String weekName;
		Scanner kb = new Scanner(System.in);
		System.out.println("Please give me the num of week");

		weekNum = kb.nextInt();

		switch(weekNum) {
			case 1:
				weekName = "Monday";
				System.out.println(weekName);
				break;

			case 2:
				weekName = "Tuesday";
				System.out.println(weekName);
				break;

			case 3:
				weekName = "Wednesday";
				System.out.println(weekName);
				break;

			case 4:
				weekName = "Thursday";
				System.out.println(weekName);
				break;

			case 5:
				weekName = "Friday";
				System.out.println(weekName);
				break;

			case 6:
				weekName = "Saturday";
				System.out.println(weekName);
				break;
				
			case 7:
				weekName = "Sunday";
				System.out.println(weekName);
				break;
				
			default:
				weekName = "It is not define";	
		}
	}

}

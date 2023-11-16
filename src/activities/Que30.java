package activities;
import java.util.Scanner;
public class Que30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i=1, N;
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter the limit : ");
		N = kb.nextInt();
		do { System.out.println((i*(i+1))/2);
			i++;
			}
		
		while(i<=N);
		
		kb.close();
	}
	

}

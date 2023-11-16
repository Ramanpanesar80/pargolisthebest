package activities;
import java.util.Scanner;
public class Que4 {
	 public static void main(String args[]){  
		  int i,factorial=1;
		  int number;
		  Scanner kb = new Scanner(System.in);
		  System.out.print("Enter a number: ");
		  number = kb.nextInt();
		  for(i=1;i<=number;i++){    
		      factorial=factorial*i;    
		  }    
		  System.out.println("Factorial of "+number+" is: "+factorial);    
		 }  
		}  
	


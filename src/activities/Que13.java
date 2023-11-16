package activities;

import java.util.Scanner;

public class Que13 {
//leap year
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner KB = new Scanner(System.in);
		  
	        System.out.print("Enter your age : ");
	        int year = KB.nextInt();
	        
	        if(year%4==0) {
	        	System.out.print("It is a leap year");
	        }
	        else {
	        	System.out.print("It is not a leap year");
	        }
		
	}

	}



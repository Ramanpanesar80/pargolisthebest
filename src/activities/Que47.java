package activities;
import java.util.*;
public class Que47 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {3,5,9,6,7,4,5};
		int length = arr.length;
		int sum = 0;
		double avg = 0;
		for (int i = 0; i<= arr.length; i ++) {
			sum = sum + arr[i];
		}
		avg = sum / length;
		System.out.println(avg);

	}

}

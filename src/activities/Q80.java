package activities;
import java.util.Arrays;
public class Q80 {
	 public static void main(String[] args) {
	        int[] arr = {12, -13, -5, 6, -15};
	        separatePositiveNegative(arr);
	        System.out.println(Arrays.toString(arr));
	    }

	    public static void separatePositiveNegative(int[] arr) {
	        int n = arr.length;
	        int[] positive = new int[n];
	        int[] negative = new int[n];
	        int positiveCount = 0, negativeCount = 0;

	        for (int num : arr) {
	            if (num >= 0) {
	                positive[positiveCount++] = num;
	            } else {
	                negative[negativeCount++] = num;
	            }
	        }

	        for (int i = 0; i < positiveCount; i++) {
	            arr[i] = positive[i];
	        }

	        for (int i = 0; i < negativeCount; i++) {
	            arr[positiveCount + i] = negative[i];
	        }
	    }
}

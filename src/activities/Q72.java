package activities;
import java.util.HashSet;
import java.util.Set;
public class Q72 {
	 public static void main(String[] args) {
	        int[] arr = {20, 20, 30, 40, 50, 50, 50};
	        int newLength = removeDuplicates(arr);
	        System.out.println("New length of the array: " + newLength);
	    }

	    public static int removeDuplicates(int[] arr) {
	        Set<Integer> set = new HashSet<>();
	        int newLength = 0;

	        for (int num : arr) {
	            if (!set.contains(num)) {
	                set.add(num);
	                newLength++;
	            }
	        }

	        return newLength;
	    }
}

package activities;
public class Q63 {
	 public static void main(String[] args) {
	        // Define three integer arrays
	        int[] firstArray = {1, 2, 3, 4, 5};
	        int[] secondArray = {1, 2, 3, 4, 5};
	        int[] thirdArray = {1, 2, 3, 4, 6};

	        // Check and print whether firstArray and secondArray are equal
	        System.out.println("Are firstArray and secondArray equal? " + areEqual(firstArray, secondArray));

	        // Check and print whether firstArray and thirdArray are equal
	        System.out.println("Are firstArray and thirdArray equal? " + areEqual(firstArray, thirdArray));
	    }

	    // Method to check if two integer arrays are equal
	    public static boolean areEqual(int[] array1, int[] array2) {
	        // Check if the arrays have different lengths, which means they can't be equal
	        if (array1.length != array2.length) {
	            return false;
	        }

	        // Iterate through the elements of both arrays and compare them
	        for (int i = 0; i < array1.length; i++) {
	            if (array1[i] != array2[i]) {
	                // If any elements do not match, the arrays are not equal
	                return false;
	            }
	        }

	        // If all elements match, the arrays are considered equal
	        return true;
	    }
}

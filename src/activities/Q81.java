package activities;
import java.util.Arrays;
import java.util.PriorityQueue;
public class Q81 {
	 public static void main(String[] args) {
	        // Define an integer array
	        int[] arr = {12, 13, 5, 6, 15};

	        // Call the sortArray method to sort the array using min-max alternating elements
	        sortArray(arr);

	        // Print the sorted array
	        System.out.println(Arrays.toString(arr));
	    }

	    // Method to sort the array using a min-max alternating pattern
	    public static void sortArray(int[] arr) {
	        // Create two PriorityQueues: one for maximum elements and one for minimum elements
	        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
	        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((o1, o2) -> o2 - o1);

	        // Add all elements to the maxHeap
	        for (int num : arr) {
	            maxHeap.offer(num);
	        }

	        // Flag to alternate between minHeap and maxHeap
	        boolean flag = true;

	        // Iterate through the array and rearrange elements in a min-max pattern
	        for (int i = 0; i < arr.length; i++) {
	            if (flag) {
	                arr[i] = maxHeap.poll();
	                flag = false;
	            } else {
	                if (!maxHeap.isEmpty()) {
	                    minHeap.offer(maxHeap.poll());
	                }
	                arr[i] = minHeap.poll();
	                flag = true;
	            }
	        }
	    }
}

package activities;
public class Q78 {
	public static void main(String[] args) {
        // Define an integer array that represents a rotated sorted array
        int[] arr = {4, 5, 6, 7, 0, 1, 2};

        // Call the findRotationCount method to determine the rotation count
        System.out.println("Rotation count in the array: " + findRotationCount(arr));
    }

    // Method to find the rotation count in a rotated sorted array
    public static int findRotationCount(int[] arr) {
        int n = arr.length;

        // If the array has fewer than 2 elements, it's not rotated, so the count is 0
        if (n < 2) {
            return 0;
        }

        int left = 0;
        int right = n - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Check if the current mid element is the pivot point indicating the rotation
            if (mid < n - 1 && arr[mid] > arr[mid + 1]) {
                return mid;
            }

            // Check if the element before the mid is the pivot point
            if (mid > 0 && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }

            // Adjust the search range based on the values at the mid and end points
            if (arr[mid] <= arr[n - 1]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return -1; // Return -1 if no rotation is found or for an invalid input
    }
}

package activities;
import java.util.Arrays;
public class Q75 {
	public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6};
        int target = 12;

        findCombinations(arr, target);
    }

    public static void findCombinations(int[] nums, int target) {
        int n = nums.length;

        // Check if there are at least four elements in the array
        if (n < 4) {
            System.out.println("Not enough elements in the array to form combinations.");
            return;
        }

        // Sort the array in ascending order for easier combination checking
        Arrays.sort(nums);

        // Iterate through the elements in the array to find combinations
        for (int i = 0; i < n - 3; i++) {
            for (int j = i + 1; j < n - 2; j++) {
                int sum1 = nums[i] + nums[j];

                for (int k = j + 1; k < n - 1; k++) {
                    int sum2 = sum1 + nums[k];

                    for (int l = k + 1; l < n; l++) {
                        int sum = sum2 + nums[l];

                        if (sum == target) {
                            System.out.println("Combination: [" + nums[i] + ", " + nums[j] + ", " + nums[k] + ", " + nums[l] + "]");
                        }
                    }
                }
            }
        }
    }
}

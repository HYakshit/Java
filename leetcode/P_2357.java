package leetcode;

import java.util.Arrays;

public interface P_2357 {
    public static void main(String[] args) {
        System.out.println(minimumOperations(new int[]{1, 2, 3, 4, 5}));
    }

    public static int minimumOperations(int[] nums) {
        int result = 0;

        // Continue until all elements in the array are zero
        while (true) {
            // Sort the array to easily find the smallest non-zero element
            Arrays.sort(nums);

            // Find the smallest non-zero element
            int subtractor = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] > 0) {
                    subtractor = nums[i];
                    break;
                }
            }

            // If no non-zero element was found, break the loop
            if (subtractor == 0) {
                break;
            }

            // Subtract the smallest non-zero element from all non-zero elements
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] > 0) {
                    nums[i] -= subtractor;
                }
            }

            // Increment the result for each operation
            result++;
        }

        return result;
    }

}

package leetcode;

public class SearchInsert {
    public static void main(String[] args) {
        System.out.println(searchInsert(Input.arr1,5));
    }
    public static int searchInsert(int[] nums, int target) {
        // Given a sorted array of distinct integers and a target value, return the
        // index if the target is found. If not,
        // return the index where it would be if it were inserted in order.
        // You must write an algorithm with O(log n) runtime complexity.
        // Example 1:
        // Input: nums = [1,3,5,6], target = 5
        // Output: 2
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            if (target > nums[mid]) {
                start = mid + 1;
            } else if (target < nums[mid]) {
                end = mid - 1;
            }
        }
        return start;
    }
}

package leetcode;

import java.util.HashMap;

public class MajorityElement {
    public static void main(String[] args) {
        int output=majorityElement(Input.repeatedArr);
        System.out.println(output);
    }
    public static int majorityElement(int[] nums) {
        // 169
        // Given an array nums of size n, return the majority element.

        // The majority element is the element that appears more than ⌊n / 2⌋ times. You
        // may assume that the majority element always exists in the array.

        // Example 1:

        // Input: nums = [3,2,3]
        // Output: 3
        int num = nums[0];
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
            if (map.get(nums[i]) > (nums.length / 2)) {
                num = nums[i];
                break;
            }

        }
        return num;
    }
}

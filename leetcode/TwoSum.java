package leetcode;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] output= twoSum(new int[]{3,2,4},6);
        for (int i:output){
            System.out.println(i);
        }
    }
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(nums[i]+nums[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1};
    }
}
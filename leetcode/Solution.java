package leetcode;

import java.util.*;

class Solution {
    public String multiply(String num1, String num2) {
        // 43
        // Given two non-negative integers num1 and num2 represented as strings, return
        // the product of num1 and num2, also represented as a string.

        // Note: You must not use any built-in BigInteger library or convert the inputs
        // to integer directly.

        // Example 1:

        // Input: num1 = "2", num2 = "3"
        // Output: "6"
        long n = Long.parseLong(num1);
        long j = Long.parseLong(num2);
        long sol = n 
        * j;
        return Long.toString(sol);
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // 88
        // You are given two integer arrays nums1 and nums2, sorted in non-decreasing
        // order, and two integers m and n, representing the number of elements in nums1
        // and nums2 respectively.

        // Merge nums1 and nums2 into a single array sorted in non-decreasing order.

        // The final sorted array should not be returned by the function, but instead be
        // stored inside the array nums1. To accommodate this, nums1 has a length of m +
        // n, where the first m elements denote the elements that should be merged, and
        // the last n elements are set to 0 and should be ignored. nums2 has a length of
        // n.
        // Example 1:
        // Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
        // Output: [1,2,2,3,5,6]
        // Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
        // The result of the merge is [1,2,2,3,5,6] with the underlined elements coming
        // from nums1.

        for (int j = 0, i = m; j < n; j++) {
            nums1[i] = nums2[j];
            i++;
        }
        Arrays.sort(nums1);
    }

    public float findMedianSortedArrays(int[] nums1, int[] nums2) {
        // 4
        // Given two sorted arrays nums1 and nums2 of size m and n respectively, return
        // the median of the two sorted arrays.
        // The overall run time complexity should be O(log (m+n)).
        // Example 1:

        // Input: nums1 = [1,3], nums2 = [2]
        // Output: 2.00000
        // Explanation: merged array = [1,2,3] and median is 2.
        int[] c = new int[(nums1.length + nums2.length)];
        int k = 0, i = 0, j = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                c[k] = nums1[i];
                i++;
                k++;
            } else {
                c[k] = nums2[j];
                j++;
                k++;
            }
        }

        while (i < nums1.length) {
            c[k] = nums1[i];
            i++;
            k++;
        }
        while (j < nums2.length) {
            c[k] = nums2[j];
            j++;
            k++;
        }
        // for (int ele : c) {
        // System.out.println(ele + " ");
        // }
        float ans = 0;
        int arrayLength = c.length;
        if (arrayLength % 2 == 0) {
            System.out.println('k');
            int first = arrayLength / 2 - 1;
            int second = (arrayLength / 2);
            System.out.println(c[first] + "" + c[second]);
            ans = (float) ((c[first] + c[second]) / 2);
            return ans + 0.5f;
        } else {
            int index = arrayLength / 2;
            ans = c[index];
            return ans;
        }
    }

    public int majorityElement(int[] nums) {
        int num = nums[0];
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
            if (map.get(nums[i]) > nums.length / 2) {
                num = nums[i];
                break;
            }

        }
        return num;
    }

    public int trailingZeroes(int n) {
        // 169
        // Given an array nums of size n, return the majority element.

        // The majority element is the element that appears more than ⌊n / 2⌋ times. You
        // may assume that the majority element always exists in the array.

        // Example 1:

        // Input: nums = [3,2,3]
        // Output: 3
        int sum = 0;
        while (n > 0) {
            sum += (n / 5);
            n /= 5;
        }
        return sum;
    }

    public int[] plusOne(int[] digits) {
        int len = digits.length - 1;
        int[] ar;
        if (len == 0) {
            if (digits[len] == 9) {
                return new int[] { 1, 0 };
            }
            digits[len] += 1;
            return digits;
        }
        for (int i = len; i >= 0; i--) {
            if (digits[i] == 9) {
                if (i == 0) {
                    ar = new int[digits.length + 1];
                    Arrays.fill(ar, 0);
                    ar[0] = 1;
                    return ar;
                }
                digits[i] = 0;
            } else {
                digits[i] += 1;
                return digits;
            }
        }
        digits[len] += 1;
        return digits;
    }

    public int removeDuplicates(int[] nums) {
        int j = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }

    public int searchInsert(int[] nums, int target) {
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

    class Input {
        public static void main(String[] args) {
            Solution obj = new Solution();

            // plus one------
            // int[] ar = {1,2,3,0,0,0};
            // int[] ar2 = {2,6,7};
            // int[] sol = obj.plusOne(ar);
            // for (int i : sol) {
            // System.out.print(i + " ");
            // }

            // findMedianSortedArrays------
            // float sol = obj.findMedianSortedArrays(ar, ar2);
            // System.out.println(sol);

            // majority element-----
            // System.out.println(obj.majorityElement(ar));

            // trailing zeroes-------
            // System.out.println(obj.trailingZeroes(150));

            // merge sorted-----
            // int[] ar = {1,2,3,0,0,0};
            // int[] ar2 = {2,6,7};
            // int m=ar2.length;
            // int n=ar2.length;
            // obj.merge(ar, m, ar2, n);
            // for(int ele:ar){
            // System.out.println(ele);
            // }

            // 35. Search Insert Position
            // int[] ar2 = { 1, 3, 5, 6 };
            // System.out.println(obj.searchInsert(ar2, 5));

            // string multiply
            System.out.println(obj.multiply("123456789", "987654321"));
        }
    }
}
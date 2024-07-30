package leetcode;

import java.util.*;

import arrays.Arrayhelper;
import strings.StringHelper;

import javax.swing.*;

class Solution {
    Arrayhelper arrHelper = new Arrayhelper();
    StringHelper strHelper = new StringHelper();

    public String multiply(String num1, String num2) {
        // 43`
        // Given two non-negative integers num1 and num2 represented as strings, return
        // the product of num1 and num2, also represented as a string.

        // Note: You must not use any built-in BigInteger library or convert the inputs
        // to integer directly.
        // Example 1:

        // Input: num1 = "2", num2 = "3"
        // Output: "6"
        long n = Long.parseLong(num1);
        long j = Long.parseLong(num2);
        long sol = n * j;
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
        float ans = 0;
        int arrayLength = c.length;
        if (arrayLength % 2 == 0) {
            int first = arrayLength / 2 - 1;
            int second = (arrayLength / 2);
            return (float) ((c[first] + c[second]) / 2.0f);
        } else {
            int index = arrayLength / 2;
            ans = c[index];
            return ans;
        }
    }

    public int majorityElement(int[] nums) {
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

    public int trailingZeroes(int n) {
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
                return new int[]{1, 0};
            }
            digits[len] += 1;
            return digits;
        }
        for (int i = len; i >= 0; i--) {
            if (digits[i] == 9) {
                digits[i] = 0;
                if (i == 0) {
                    ar = new int[digits.length + 1];
                    Arrays.fill(ar, 0);
                    ar[0] = 1;
                    return ar;
                }

            } else {
                digits[i] += 1;
                return digits;
            }
        }
        digits[len] += 1;
        return digits;
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

    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        Arrays.sort(aliceSizes);
        Arrays.sort(bobSizes);
        int[] result = new int[2];
        int alicesum = arrHelper.sumArray(aliceSizes);
        int bobsum = arrHelper.sumArray(bobSizes);
        for (int i = aliceSizes.length - 1; i >= 0; i--) {
            for (int j = bobSizes.length - 1; j >= 0; j--) {
                int difference = aliceSizes[i] - bobSizes[j];
                if (alicesum - difference == bobsum + difference) {
                    result[0] = aliceSizes[i];
                    result[1] = bobSizes[j];
                }
            }
        }
        return result;
    }

    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return true;
            }
        }
        return false;
    }

    public int arraySign(int[] nums) {
//        1822
//        There is a function signFunc(x) that returns:
//1 if x is positive.
//-1 if x is negative.
//0 if x is equal to 0.
//You are given an integer array nums. Let product be the product of all values in the array nums.
//Return signFunc(product).

        int count = 0, sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                return 0;
            }
            if (nums[i] < 0) {
                count++;

            }
        }
        if (count % 2 == 0) {
            return 1;
        }
        return -1;
    }

    public int[] arrayRankTransform(int[] arr) {
//    Given an array of integers arr, replace each element with its rank.
//
//            The rank represents how large the element is. The rank has the following rules:
//
//    Rank is an integer starting from 1.
//    The larger the element, the larger the rank. If two elements are equal, their rank must be the same.
//            Rank should be as small as possible.
        if (arr.length == 1) {
            return new int[]{1};
        }
        int[] sorted = Arrays.copyOf(arr, arr.length);
        Arrays.sort(sorted);
//        ahelper.parray(sorted);
        int rank = 1, previous = -1;
        for (int element : sorted) {
            if (previous == element) {
                continue;
            }
            int i = 0;
            while (i < arr.length) {
                if (element == arr[i]) {
                    arr[i] = rank;

                }
                i++;
            }
            rank++;
            previous = element;
        }
        return arr;
    }

    public int myAtoi(String s) {
//8
//        Implement the myAtoi(string s) function, which converts a string to a 32-bit signed integer.
//
//The algorithm for myAtoi(string s) is as follows:
//
//Whitespace: Ignore any leading whitespace (" ").
//Signedness: Determine the sign by checking if the next character is '-' or '+', assuming positivity is neither present.
//Conversion: Read the integer by skipping leading zeros until a non-digit character is encountered or the end of the string is reached. If no digits were read, then the result is 0.
//Rounding: If the integer is out of the 32-bit signed integer range [-231, 231 - 1], then round the integer to remain in the range. Specifically, integers less than -231 should be rounded to -231, and integers greater than 231 - 1 should be rounded to 231 - 1.
//Return the integer as the final result.
        StringBuilder str = new StringBuilder(s.trim());
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char v = str.charAt(i);

        }
        return 0;
    }

    public List<String> cellsInRange(String s) {
        List<String> list = new ArrayList<>();
        char startCharacter = s.charAt(0);
        char endCharacter = s.charAt(3);
        int startNumber = s.charAt(1) - '0';
        int endNumber = s.charAt(4) - '0';

        for (char i = startCharacter; i <= endCharacter; i++) {
            for (int j = startNumber; j <= endNumber; j++) {
                list.add("" + i + j);
            }
        }
        return list;
    }

    public static boolean isPallindrome(String str) {
//        used toString to convert stringBuilder object to string object
        String previous = str;
        String reversedStr = new StringBuilder(previous).reverse().toString();
        return previous.equals(reversedStr);
    }

    public String[] findWords(String[] words) {
        String[] keyArray = {"qwertyuiop", "asdfghjkl", "zxcvbnm"};
        List<String> resultList = new ArrayList<>();

        for (String word : words) {
            for (String row : keyArray) {
                if (canBeTyped(word.toLowerCase(), row)) {
                    resultList.add(word);
                    break;
                }
            }
        }
        return resultList.toArray(new String[0]);
    }

    private boolean canBeTyped(String word, String row) {
        for (char c : word.toCharArray()) {
            if (row.indexOf(c) == -1) {
                return false;
            }
        }
        return true;
    }
}

public class Input {
    public static void main(String[] args) {
        Solution obj = new Solution();
        Arrayhelper ahelper = new Arrayhelper();
        StringHelper strHelper = new StringHelper();

//       Array declarations
        int[] duplicateElements = {37, 12, 28, 9, 100, 56, 80, 5, 12};
        int[] single = {5};
        int[] unique1 = {2, 6, 7};
        int[] unique2 = {9, 1, 4, 3, 8};
        int[] sorted1 = {1, 2, 3, 4};
        int[] sorted2 = {-3, -1, 0, 5, 88, 9, 8};
        int[] bothSign = {88, 7, -3, -1, 0, 5, 9, 8};
        String[] str1 = {"akshit", "buuuuu", "qwerty"};

//        string declarations
        String numstr = "123456789";
        String smallnum = "          99";
        String numstr2 = "987654321";
        String simple = "akshit";
        String duplicateChars = "popsos";
        String sortedChars = "abcdefgh";

        String[] result = obj.findWords(str1);
        for (String str : result) {
            System.out.println(str);
        }

        System.out.println(smallnum.trim());
//        obj.myAtoi(smallnum);


//        arrayRankTransform
//        int[] r = obj.arrayRankTransform(duplicateElements);
//        ahelper.parray(r);

//        arraySign
//        System.out.println(obj.arraySign(bothSign));

        // plus one------
        // int[] sol = obj.plusOne(single);
        // for (int i : sol) {
        // System.out.print(i + " ");
        // }

        // findMedianSortedArrays------
        // int[] ar = {1,2,3,4};
        // int[] ar2 = {0,5};
        // float sol = obj.findMedianSortedArrays(sorted1, sorted2);
        // System.out.println(sol);

        // majority element-----
        // System.out.println(obj.majorityElement(duplicateElements));

        // trailing zeroes-------
        // System.out.println(obj.trailingZeroes(150));

        // merge sorted-----
//         int m=sorted1.length;
//         int n=sorted2.length;
//         obj.merge(sorted1, m, sorted2, n);
//         for(int ele:sorted1){
//         System.out.println(ele);
//         }

        // Search Insert Position
//         System.out.println(obj.searchInsert(unique1, 5));

        // string multiply
//         System.out.println(obj.multiply(numstr,numstr2));

//        fairCandySwap
//        888
//        int[] ali = {1, 1};
//        int[] bob = {2, 2};
//        int[] res = obj.fairCandySwap(ali, bob);
//        ahelper.parray(res);
//        System.exit(69);

//        containsDuplicate
//        System.out.println(obj.containsDuplicate(unique1));

//     cellsInRange
//        List<String> result= obj.cellsInRange("a1:h8");
//
//        System.out.println(result);

//        is pallindrome
//        boolean r = obj.isPallindrome("12111");
//        System.out.println(r);

//
    }
}
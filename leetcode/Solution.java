package leetcode;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static java.lang.Math.max;

class Solution {
    public static boolean isPalindrome(int x) {
        int reversed = 0, rem = 0, orignal = 0;
        orignal = x;
        while (orignal != 0) {
            rem = orignal % 10;
            reversed = reversed * 10 + rem;
            orignal /= 10;
        }
        if (reversed == x) {
            return true;
        } else {
            return false;
        }

    }

    public static void reverse(int[] arr, int n) {
        int start = arr.length - n, end = n - 1;
        if (start >= end) {
            return;
        }

        int temp = 0;
        temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        reverse(arr, n - 1);
        System.out.println(Arrays.toString(arr));
    }

    static void reverse(String str) {
        if (str == null || str.length() <= 1) {
            System.out.print(str);
            return;
        }
        reverse(str.substring(1));       // recursive call
        System.out.print(str.charAt(0)); // print in reverse order
    }

    static void numFreq(int[] arr) {

        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);
        int[] freq = new int[max + 1];
        for (int i = 0; i < arr.length; i++) {
            int ele = arr[i];
            freq[arr[i]]++;
        }
        System.out.println(Arrays.toString(freq));
    }

    public static void threeSum(int[] nums) {

    }

}

class main {
    public static void main(String[] args) {
//        System.out.println( Solution.isPalindrome(121));
        int[] a = {1, 2, 3, -4, 0, 4};
//        Solution.reverse(a,6);
//        Solution.reverse("akshit");
//        Solution.numFreq(new int[] {1,2,32,98,99,4});
        Solution.threeSum(a);
    }
}

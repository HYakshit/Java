package leetcode;

import arrays.Arrayhelper;

import java.util.*;

public class TwoOutOfThree_2032 {
    public static void main(String[] args) {
        int[] arr1 = {1, 1, 3, 2};
        int[] unsortedArr = {2, 3};
        int[] unique1 = {3};
        System.out.println(twoOutOfThree(arr1, unique1, unsortedArr));
    }

    public static List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        List<Integer> result = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        for (int element : nums1) {
            if (arraycontains(element, nums2)) {
                set.add(element);
                if (arraycontains(element, nums3)) {
                    set.add(element);
                }
            }
        }
        return new ArrayList<>(set);
    }

    public static boolean arraycontains(int element, int[] ar) {
        boolean result = false;
        for (int i : ar) {
            if (element == i) {
                result = true;
                break;
            }
        }
        return result;
    }

    static int[] smallest(int[] ar1, int[] ar2, int[] ar3) {
        int[] result = ar1;
        if (ar2.length < ar1.length) {
            result = ar2;
        } else if (ar3.length < ar1.length) {
            result = ar3;
        }
        return result;
    }
}

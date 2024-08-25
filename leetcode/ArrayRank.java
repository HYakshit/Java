package leetcode;

import java.util.Arrays;

public class ArrayRank {
    public static void main(String[] args) {
        int[] output= arrayRankTransform(Input.arr1);
        for(int i:output){
            System.out.println(i);
        }
    }
    public static int[] arrayRankTransform(int[] arr) {
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
}

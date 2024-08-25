package leetcode;

import java.util.Arrays;

public class FairCandySwap {
    //    888

    public static void main(String[] args) {
        int[] ali = {1, 1};
        int[] bob = {2, 2};
        int[] output = fairCandySwap(ali, bob);
       for (int i:output){
           System.out.println(i);
       }
    }

    public static int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        Arrays.sort(aliceSizes);
        Arrays.sort(bobSizes);
        int[] result = new int[2];
        int alicesum = ArraySum(aliceSizes);
        int bobsum = ArraySum(bobSizes);
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

    static int ArraySum(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }
}

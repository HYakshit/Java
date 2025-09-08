package leetcode;

import java.util.Arrays;

public class Plusone {
    public static void main(String[] args) {
        int[] output = plusOne(Input.unique2Arr);
        for (int i : output) {
            System.out.println(output[i]);
        }
    }

    public static int[] plusOne(int[] digits) {
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
}

package leetcode;

import java.util.Arrays;

public class MinBitFlips {
    public static void main(String[] args) {

        System.out.println(minBitFlips(1100011, 011101));
    }

    public static int minBitFlips(int start, int goal) {
        String str1 = getbinary(start);
        String str2 = getbinary(goal);
        if (str1.length() < str2.length()) {
            str1 = paddZero(str1, str2.length());
        } else {
            str2 = paddZero(str2, str1.length());
        }
        int shifts = 0;
        char[] givenNumber = str1.toCharArray();
        char[] desiredNumber = str2.toCharArray();

        for (int i = desiredNumber.length - 1; i >= 0; i--) {
            if (desiredNumber[i] != givenNumber[i]) {
                shifts++;
            }
        }
        return shifts;
    }

    static String getbinary(int num) {
        String binary = "";
        while (num > 0) {
            int digit = num % 2;
            binary = digit + binary;
            num = num / 2;
        }
        System.out.println(binary);
        return binary;
    }

    static String paddZero(String str, int range) {
//        StringBuilder sb= new StringBuilder(str);
        for (int i = 0; i < range - str.length(); i++) {
            str = "0" + str;
        }
        return str;
    }
}

package leetcode;

import java.util.SplittableRandom;

public class GetLucky {
    public static void main(String[] args) {
//        1945
        String str = "leetcode";
        int output = getLucky(str, 2);
        System.out.println(output);
        asciValue(str);
    }

    public static int getLucky(String s, int k) {
        char[] ar = s.toCharArray();
//        int num = 0;
        StringBuilder numAsString = new StringBuilder();
        for (int i = 0; i < ar.length; i++) {
            int ch = ar[i] - 96;
            numAsString.append(ch);
        }
        return digitSum(numAsString.toString(), k);
    }

    public static int digitSum(String num, int k) {
        char[] digitsArray = num.toCharArray();
        int sum = 0;
        if (k < 1 || digitsArray.length <= 1) {
            for (char i = 0; i < digitsArray.length; i++) {
                sum = sum* 10 + digitsArray[i];
            }
            return sum;
        }
        for (int i = 0; i < digitsArray.length; i++) {
            char ch = digitsArray[i];
            sum +=ch;
        }

        return digitSum(Integer.toString(sum), --k);
    }

    public static void asciValue(String str) {
        char[] arr = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            System.out.print(arr[i] + ":" + (int) arr[i] + " ");
        }
    }
}

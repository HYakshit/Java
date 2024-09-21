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
        StringBuilder numAsString = new StringBuilder();
        for (int i = 0; i < ar.length; i++) {
            numAsString.append((int) ar[i]-96);
        }
        return digitSum(numAsString, k);
    }

    public static int digitSum(StringBuilder string, int k) {
        int sum = 0;
        while (k >= 0) {
           sum=0;
            for (char i = 0; i < string.length(); i++) {
                sum += (string.charAt(i) - '0');
            }
            string.setLength(0);
            string.append(sum);
            k--;
        }
        return sum;
    }

    public static void asciValue(String str) {
        char[] arr = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            System.out.print(arr[i] + ":" + (int) arr[i] + " ");
        }
    }
}

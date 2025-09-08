package leetcode;

import javax.print.DocFlavor;

public class RestoreString_1528 {
    public static void main(String[] args) {
        System.out.println(restoreString("codeleet", new int[]{4, 5, 6, 7, 0, 2, 1, 3}));
    }

    public static String restoreString(String s, int[] indices) {
        char[] result = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            result[indices[i]] = s.charAt(i);
        }
        return new String(result);
    }
}

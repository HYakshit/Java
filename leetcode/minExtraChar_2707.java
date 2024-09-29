package leetcode;

import java.util.Arrays;
import java.util.HashSet;

public class minExtraChar_2707 {
    public static void main(String[] args) {
        String[] dic = new String[]{"hello","world"};
        System.out.println(minExtraChar("sayhelloworld", dic));
    }

    public static int minExtraChar(String s, String[] dictionary) {
        int result = s.length();
        for (String word : dictionary) {
            if (s.contains(word)) {
                int used = word.length();
                result = result - used;
            }
        }
        return result;
    }
}

package leetcode;

import java.util.ArrayList;
import java.util.List;

public class FindWords {
    public static void main(String[] args) {
        for (String i : findWords(new String[]{"qwer", "asd","kun"})){
            System.out.println(i);
        }
    }

    public static String[] findWords(String[] words) {
        String[] charArrays = {"qwertyuiop", "asdfghjkl", "zxcvbnm"};
        List<String> resultList = new ArrayList<>();

        for (String word : words) {
            for (String charArray : charArrays) {
                if (canBeTyped(word.toLowerCase(), charArray)) {
                    resultList.add(word);
                    break;
                }
            }
        }
        return resultList.toArray(new String[0]);
    }

    private static boolean canBeTyped(String word, String charArray) {
        for (char c : word.toCharArray()) {
            if (charArray.indexOf(c) == -1) {
                return false;
            }
        }
        return true;
    }
}

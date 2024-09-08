package leetcode;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReplaceWords {
    public static void main(String[] args) {
        System.out.println(replaceWords(Input.stringList,"a aa a aaaa aaa aaa aaa aaaaaa bbb baba ababa"));
    }

    public static String replaceWords(List<String> dictionary, String sentence) {
        Collections.sort(dictionary);
        for (int i = 0; i < dictionary.size(); i++) {
            for (int j = i + 1; j < dictionary.size();) {
                if (dictionary.get(j).startsWith(dictionary.get(i))) {
                    dictionary.remove(j);
                } else {
                    j++;
                }
            }
        }
        String[] words = sentence.split("\\s+"); // Split the sentence into words
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            boolean replaced = false;
            for (String prefix : dictionary) {
                if (word.startsWith(prefix) && !replaced) {
                    result.append(prefix).append(" ");
                    replaced = true;
                }
            }
            if (!replaced) {
                result.append(word).append(" ");
            }
        }

        return result.toString().trim();
    }
}
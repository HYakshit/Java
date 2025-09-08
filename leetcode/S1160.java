package leetcode;

import java.util.Arrays;

public class S1160 {
    public int countCharacters(String[] words, String chars) {
        int[] charCount = new int[26]; // Store frequency of characters in chars

        for (char ch : chars.toCharArray()) {
            charCount[ch - 'a']++; // Count occurrences
        }

        int totalLength = 0;

        for (String word : words) {
            int[] wordCount = new int[26]; // Count frequency of word

            for (char ch : word.toCharArray()) {
                wordCount[ch - 'a']++;
            }

            boolean isGood = true;
            for (int i = 0; i < 26; i++) {
                if (wordCount[i] > charCount[i]) {
                    isGood = false;
                    break;
                }
            }

            if (isGood) {
                totalLength += word.length();
            }
        }
        return totalLength;
    }

    public static void main(String[] args) {
        S1160 obj = new S1160();
        String[] words = {"cat", "bt", "hat", "tree"};
        String chars = "atach";
        System.out.println(obj.countCharacters(words, chars)); // Output: 6
    }
}

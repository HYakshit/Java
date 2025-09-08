package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GroupAnagrams {
    //    Given an array of strings strs, group the anagrams together. You can return the answer in any order.
//
//An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
//
//
//
//Example 1:
//
//Input: strs = ["eat","tea","tan","ate","nat","bat"]
//Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
    public static void main(String[] args) {
        System.out.println(groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"}));
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> mainList = new ArrayList<>();
        boolean[] visited = new boolean[strs.length]; // to track if a string has already been grouped

        for (int i = 0; i < strs.length; i++) {
            if (visited[i]) continue; // skip if already grouped
            List<String> subList = new ArrayList<>();
            subList.add(strs[i]); // add the current string
            visited[i] = true;

            for (int j = i + 1; j < strs.length; j++) {
                if (!visited[j] && sortString(strs[i]).equals(sortString(strs[j]))) {
                    subList.add(strs[j]);
                    visited[j] = true; // mark as grouped
                }
            }
            mainList.add(subList); // add the group to the main list
        }
        return mainList;
    }


    public static String sortString(String input) {
        // Convert the string to a character array
        char[] charArray = input.toCharArray();

        // Sort the character array
        Arrays.sort(charArray);
        // Convert the sorted character array back to a string
        return new String(charArray);

    }
}

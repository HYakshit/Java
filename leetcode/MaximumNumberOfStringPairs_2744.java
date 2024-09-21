package leetcode;

import java.util.Objects;

public class MaximumNumberOfStringPairs_2744 {
    public static void main(String[] args) {
        System.out.println(maximumNumberOfStringPairs(new String[]{"ab","kl","ba","lk"}));
    }
    public static int maximumNumberOfStringPairs(String[] words) {
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            String reversed = words[i].charAt(1)+""+words[i].charAt(0);
            for (int j = i + 1; j < words.length; j++) {
                if (reversed.equals(words[j])) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }

}

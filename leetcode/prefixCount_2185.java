package leetcode;

public interface prefixCount_2185 {
    public static void main(String[] args) {
        System.out.println(prefixCount(Input.StrArray2, "code"));
    }

    public static int prefixCount(String[] words, String pref) {
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            if (words[i].startsWith(pref)) {
                count++;
            }
        }
        return count;
    }
}

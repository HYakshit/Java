package strings;

public class StrPalindrome {
    public static boolean strPallindrome(String str) {
        int start = 0;
        boolean result = true;
        int end = str.length() - 1;
        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                result = false;
                break;
            }
            start++;
            end--;
        }
        return result;
    }

    public static void main(String[] args) {
        String str = "Akshit";
        String str2 = "akshska";
        System.out.println(strPallindrome(str2));
    }

}

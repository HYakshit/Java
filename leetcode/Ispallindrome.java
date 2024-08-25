package leetcode;

public class Ispallindrome {
    public static void main(String[] args) {
        System.out.println(isPallindrome("Pallindrome check output is "+Input.str1));
    }
    public static boolean isPallindrome(String str) {
//        used toString to convert stringBuilder object to string object
        String previous = str;
        String reversedStr = new StringBuilder(previous).reverse().toString();
        return previous.equals(reversedStr);
    }
}

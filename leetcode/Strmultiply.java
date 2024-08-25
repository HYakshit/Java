package leetcode;

public class Strmultiply {
    public static void main(String[] args) {
        System.out.println(multiply(Input.numstr1, Input.numstr2));
    }

    public static String multiply(String num1, String num2) {
        // 43`
        // Given two non-negative integers num1 and num2 represented as strings, return
        // the product of num1 and num2, also represented as a string.

        // Note: You must not use any built-in BigInteger library or convert the inputs
        // to integer directly.
        // Example 1:

        // Input: num1 = "2", num2 = "3"
        // Output: "6"
        long n=0,j=0;
        try {
             n = Long.parseLong(num1);
             j = Long.parseLong(num2);
        } catch (NumberFormatException e) {
            System.out.println("Enter string with numbers only ------"+e);
        }

        long sol = n * j;
        return Long.toString(sol);
    }
}

package leetcode;

public class atoi {
    private static int num;

    public static void main(String[] args) {
        System.out.println(myAtoi("-00098"));
    }
    public static int myAtoi(String s) {
        int num = 0;
        boolean negative = false;

        // Trim leading whitespace
        s = s.trim();

        // Check for sign
        if (!s.isEmpty() && (s.charAt(0) == '-' || s.charAt(0) == '+')) {
            negative = s.charAt(0) == '-';
            s = s.substring(1);
        }

        // Parse digits
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!Character.isDigit(c)) {
                break;
            }
            int digit = Character.getNumericValue(c);
            if (num > Integer.MAX_VALUE / 10 || (num == Integer.MAX_VALUE / 10 && digit > Integer.MAX_VALUE % 10)) {
                return negative ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }
            num = num * 10 + digit;
        }
        return negative ? -num : num;
    }
}

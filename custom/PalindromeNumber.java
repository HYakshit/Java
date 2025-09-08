import java.util.*;

public class PalindromeNumber {
    public static void main(String[] args) {
        int num, orig, lastdigit, temp = 0;
        Scanner aja = new Scanner(System.in);
        System.out.println("enter the number");
        num = aja.nextInt();
        orig = num;
        while (num != 0) {
            lastdigit = num % 10;
            temp = temp * 10 + lastdigit;
            num = num / 10;
        }
        if (orig == temp)
            System.out.println("number is Pallindrome");
        else {
            System.out.println("number is not Pallindrome");
        }
        aja.close();
    }
}
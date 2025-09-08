package custom;

import java.util.*;

public class Armstrong {
    public static void main(String[] args) {
        int num, orig, rem, result = 0;
        Scanner aja = new Scanner(System.in);
        System.out.println("enter the number");
        num = aja.nextInt();
        orig = num;

        while (num != 0) {
            rem = num % 10;
            result = result + (rem * rem * rem);
            num = num / 10;
        }
        if (orig == result) {
            System.out.println("Number is Armstrong");
        } else
            System.out.println("Number is not Armstrong");
        aja.close();
    }
}
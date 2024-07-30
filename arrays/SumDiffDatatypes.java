package arrays;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SumDiffDatatypes {
    public static void sum() {
        System.out.println("Enter numbers(0 to exit)");
        int num = -1;
        int negSum = 0, oddSum = 0, evenSum = 0;
        Scanner in = new Scanner(System.in);
        try {
            while (true) {
                num = in.nextInt();
                if (num == 0) {
                    break;
                }
                if (num < 0) {
                    negSum += num;
                } else if (num % 2 == 0) {
                    evenSum += num;
                } else {
                    oddSum += num;
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("input mismatch");
        }
        System.out.printf("Negitive sum %d , Even sum %d , Odd sum%d%n", negSum, evenSum, oddSum);
    }
    public static void main(String[] args) {
        sum();
    }
}

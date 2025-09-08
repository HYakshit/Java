package arrays;

import java.util.Scanner;

public class Lsarray {
    public static void main(String[] args) {
        int[] ar = new int[5];
        Scanner in = new Scanner(System.in);
        System.out.println("enter 5 elements");
        for (int i = 0; i < ar.length; i++) {
            ar[i] = in.nextInt();
        }
        int max = ar[0], min = ar[0];
        for (int j : ar) {

            if (j > max) {
                max = j;
            }
            if (j < min) {
                min = j;
            }

        }
        System.out.println("largest is " + max + "Smallest is " + min);
    }

}

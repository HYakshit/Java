package arrays;

import java.util.Scanner;

public class DiagonalSun {
    public static void main(String[] args) {
        int[][] a = new int[3][3];
        Scanner in = new Scanner(System.in);
        System.out.println("enter 9 elements of 3*3 matrix");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = in.nextInt();
            }

        }
        int dsum = 0, rdsum = 0;
        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < a[i].length; j++) {
                if (i == j) {
                    dsum = dsum + a[i][j];
                }

                 if (j == ((a.length - 1) - i)) {
                    rdsum = rdsum + a[i][j];
                }
            }
        System.out.println("Sum of diagonal is "+dsum+" Sum of reversed diagonal is "+rdsum);
        in.close();
    }

}

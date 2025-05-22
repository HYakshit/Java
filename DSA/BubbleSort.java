package DSA;

import java.util.*;

public class BubbleSort {
    public static void main(String[] args) {
        int size, i, j, temp;
        try (Scanner aja = new Scanner(System.in)) {
            // input
            System.out.println("Enter size of array");
            size = aja.nextInt();
            int[] a = new int[size];

            System.out.println("Enter integer elements");
            for (i = 0; i < a.length; i++) {
                a[i] = aja.nextInt();
            }

            // bubble sort
            for (i = 0; i < a.length - 1; i++) {
                for (j = 0; j < a.length - i - 1; j++) {
                    if (a[j] > a[j + 1]) {
                        temp = a[j];
                        a[j] = a[j + 1];
                        a[j + 1] = temp;
                    }
                }
            }

            // output
            System.out.println("Sorted elements:");
            for (i = 0; i < a.length; i++) {
                System.out.print(a[i] + " ");
            }
        }
    }
}

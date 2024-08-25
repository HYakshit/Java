package arrays;

import java.util.*;

public class BubbleSort {
// places each element at right position with every inner loop iteration
    public static void main(String[] args) {
        int s, i, j, temp;
        try (Scanner aja = new Scanner(System.in)) {
            // input
            System.out.println("Enter size of array");
            s = aja.nextInt();
            int[] a = new int[s];

            System.out.println("enter integer elements");
            for (i = 0; i < a.length; i++) {
                a[i] = aja.nextInt();
            }
            // opperation
            for (i = 0; i < a.length; i++) {
                for (j = i + 1; j < a.length; j++) {
                    if (a[i] > a[j]) {
                        temp = a[i];
                        a[i] = a[j];
                        a[j] = temp;
                    }
                }
            }



            // output
            System.out.println("sorted elements");
            for (i = 0; i < a.length; i++) {
                System.out.print(a[i] + " ");
            }
        }

    }
}

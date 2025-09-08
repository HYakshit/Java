package recurssion;

import java.util.Scanner;

public class bsearch {
    public static int bsearchm(int[] num, int element, int first, int last) {
        int loc = -1;
        if (first <= last) {
            int midindex = (first + last) / 2;
            if (element == num[midindex]) {
                loc = midindex;
                return loc;
            } else if (element > num[midindex]) {
                first = midindex + 1;
            } else if (element < num[midindex]) {
                last = midindex - 1;
            }
            return bsearchm(num, element, first, last);
        }
        return loc;
        // kk

    }

    public static void main(String[] args) {
        Scanner aja = new Scanner(System.in);
        int[] num = new int[10];
        int element;
        // input
        System.out.println("enter integer numbers <10");
        for (int i = 0; i < num.length; i++) {
            num[i] = aja.nextInt();
        }
        System.out.println("enter number to find");
        element = aja.nextInt();
        // method call
        int first = 0, last = num.length - 1;
        int loc = bsearchm(num, element, first, last);
        if (loc != -1) {
            System.out.println("number " + element + " is at location " + loc);
        }
    }

}

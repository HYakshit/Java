package arrays;

import java.util.Scanner;

public class Pallindrome {

    static boolean isPallindrome(int[] arr) {
        int iterator = arr.length - 1;
        int first = 0;
        while (iterator >= (arr.length / 2)) {
            if (arr[first] != arr[iterator]) {
                return false;
            }

                iterator--;
            first++;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner in = new Scanner(System.in);
        System.out.println("enter 5 elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println("Pallindrome result is "+isPallindrome(arr));

    }

}

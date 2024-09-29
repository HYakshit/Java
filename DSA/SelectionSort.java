package DSA;

import leetcode.Input;

public class SelectionSort {
    public static void main(String[] args) {
        SS(Input.unsortedArr);
    }

    public static void SS(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int temp = 0;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i:arr){
            System.out.println(i);
        }
    }
}


package DSA;

import leetcode.Input;

public class SelectionSort {
    public static void main(String[] args) {
        SS(Input.unsortedArr);
    }

    public static void SS(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap once after finding the smallest element
            if (minIndex != i) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }

        // Output
        for (int num : arr) {
            System.out.println(num);
        }
    }

}


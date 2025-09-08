package DSA;

import leetcode.Input;

public class InsertionSort {
    public static void main(String[] args) {
        int[] result=insertionSort(Input.unsortedArr);
        for(int i:result){
            System.out.print(i+" ");
        }

    }
        public static int[] insertionSort(int[] array) {
        int j, target;
        for (int index = 1; index < array.length; index++) {
            target = array[index];
            j = index - 1;

            // Shift elements greater than target to the right
            while (j >= 0 && array[j] > target) {
                array[j + 1] = array[j];
                j--;
            }
            // Place target in its correct position
            array[j + 1] = target;
        }
        return array;

    }
}

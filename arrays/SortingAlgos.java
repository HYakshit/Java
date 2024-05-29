package arrays;

class Sort {
    // Print the sorted array
    void parray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    //    insertion
    public int[] insertion(int[] array) {
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

    //QuickSort
    void quicksort(int[] array) {
        int min = 0;
        for (int index = 0; index < array.length; index++) {
            min = array[0];

        }
    }
}

public class SortingAlgos {
    public static void main(String[] args) {
        int[] array = {1, 5, 88, 9, -3, 66, -8, 88};
        int[] res;
        Sort obj = new Sort();
        res = obj.insertion(array);
        obj.parray(res);
//        quicksort(array);
    }
}

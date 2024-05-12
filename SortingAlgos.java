public class SortingAlgos {

    public static void main(String[] args) {
        int[] array = {1, 5, 88, 9, -3, 66, -8, 88};
//        insertion(array);
//        quicksort(array);
    }

    public static void insertion(int[] array) {
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

        // Print the sorted array
        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    void quicksort(int[] array) {
        int min=0;
        for (int index = 0; index < array.length; index++) {
            min=array[0];

        }
    }

}

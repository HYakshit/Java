public class SortingAlgos {

    public static void main(String[] args) {
        int[] array = {1, 5, 88, 9, -3, 66, -8, 88};
        insetion(array);
    }

    public static void insetion(int[] array) {
        int j, target;
        for (int index = 1; index < array.length; index++) {
            target = array[index];
            j = index - 1;
            while (j >= 0 && target <= array[index]) {
                array[j+1] = array[j];
                j--;
            }
            array[j + 1] = target;
        }
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}

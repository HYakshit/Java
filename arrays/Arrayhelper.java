package arrays;

public class Arrayhelper {
    public void parray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    public int[] copyArray(int[] arr) {
        int size = arr.length;
        int[] result = new int[size];
        for (int i = 0; i < arr.length; i++) {
            result[i] = arr[i];
        }
        return result;
    }
}

package arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] array = {1, 4, 4, 22, 77, 4, 8, 88, -9};
        int target = 8;
        int index = GetBinarySearch(array, target);
        System.out.println("Index of target is" + index);
    }

    static int GetBinarySearch(int[] array, int target) {
        if (array.length == 0) {
            return -1;
        }
        int first = 0, last = array.length - 1, mid = 0;
        while (first <= last) {
            mid = (first + last) / 2;
            if (array[mid] == target) {
                return mid;
            } else if (target > array[mid]) {
                first = mid + 1;
            } else if (target < array[mid]) {
                last = mid - 1;
            }
        }
        return -1;
    }

}

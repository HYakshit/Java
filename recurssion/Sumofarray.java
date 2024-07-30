package recurssion;

public class Sumofarray {
    public static int sumArray(int[] arr, int index) {
        if (index < 0) {
            return 0; // Base case: when index goes below 0, return 0
        }
        return arr[index] + sumArray(arr, index - 1); // Recursive case: add current element and move to the previous index
    }

    public static void main(String[] args) {
        int[] array = { 2, 4, 6, 8, 10 ,3};
        int sum = sumArray(array, array.length - 1); // Start recursion from the last index
        System.out.println("Sum of elements in the array: " + sum);
    }
}
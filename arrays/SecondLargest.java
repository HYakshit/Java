package arrays;

public class SecondLargest {

    public static void secondLargest(int[] arr) {
        int secondLargest = arr[0], largest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            }
        }
        System.out.println("largest" + largest + " Second Largest" + secondLargest);
    }

    public static void main(String[] args) {
        int[] array = {1, 9, 3, 8, 5, 6,};
        secondLargest(array);
    }
}

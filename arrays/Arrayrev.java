package arrays;

class ArrayReverse {
    public static void reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            // Swap elements at start and end indices
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            // Move the start and end indices towards the center
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };

        System.out.println("Original Array:");
        for (int element : arr) {
            System.out.print(element + " ");
        }

        // Call the reverseArray function
        reverseArray(arr);

        System.out.println("\nReversed Array:");
        for (int element : arr) {
            System.out.print(element + " ");
        }
    }
}

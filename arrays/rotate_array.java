package arrays;

import java.util.Scanner;

public class rotate_array {
    static int[] rotateArray(int[] array, int rotationNumber) {
        if(rotationNumber>array.length){
            rotationNumber=rotationNumber% array.length;
        }


        int[] temp = new int[rotationNumber];

        // Store elements to rotate
        for (int i = 0; i < rotationNumber; i++) {
            temp[i] = array[i];
        }

        // Rotate the remaining elements
        for (int i = 0; i < array.length - rotationNumber; i++) {
            array[i] = array[i + rotationNumber];
        }

        // Copy rotated elements back to the array
        for (int i = 0; i < rotationNumber; i++) {
            array[array.length - rotationNumber + i] = temp[i];
        }
        return array;
    }
    public static void main(String[] args) {
        int rotationNumber=3;
        Scanner in = new Scanner(System.in);
        System.out.println("enter rotation Number");
        rotationNumber = in.nextInt();

        int[] array = { 1, 2, 3, 4, 5, 6, 7 };
        int[] result ;
        result= rotateArray(array,rotationNumber);
        for (int iterable_element : result) {
            System.out.print(iterable_element+" ");


        }
    }
}

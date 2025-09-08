package arrays;

import java.util.ArrayList;

public class Union_intersect {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5, 6, 7};
        int[] array2 = {4, 5, 9};
        interset(array1, array2);
        union(array1, array2);

    }

    static void interset(int[] array1, int[] array2) {
        System.out.println("interset");
        ArrayList<Integer> intersect = new ArrayList<>();
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    intersect.add(array1[i]);
                    break; // Move to the next element in array1
                }
            }
        }

        System.out.println(intersect);

    }

    static void union(int[] array1, int[] array2) {
        ArrayList<Integer> union= new ArrayList<>();
        System.out.println("Union:");
        // Print elements from array2 that are not in array1
        for (int i = 0; i < array2.length; i++) {
            boolean foundInArray1 = false;
            for (int j = 0; j < array1.length; j++) {
                if (array2[i] == array1[j]) {
                    foundInArray1 = true;
                    break;
                }
            }
            if (!foundInArray1) {
                System.out.print(array2[i] + " ");
            }

        }
        // Print elements from array1
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }
        System.out.println(); // Move to the next line
    }
}

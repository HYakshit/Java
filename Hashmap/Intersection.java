package hashmap;

import java.util.*;

public class Intersection {
    // intersection of two arrays
    public static void intersection(int[] ar1, int[] ar2) {
        Set<Integer> map = new HashSet<>();
        for (int i : ar1) {
            map.add(i);
        }
        for (int i : ar2) {
            if (map.contains(i)) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        int[] ar1 = { 1, 2, 3, 4, 5 };
        int[] ar2 = { 2, 3, 4 };
        Intersection.intersection(ar1, ar2);
    }
}
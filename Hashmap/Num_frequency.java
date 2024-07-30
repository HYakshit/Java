package hashmap;

import java.util.*;

public class Num_frequency {
    public static void main(String[] args) {
        int[] num = { 1, 2, 3, 4, 5, 2, 3, 1, 4, 5, 2, 1, 4, 3, 2, 1 };

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < num.length; i++) {
            if (map.containsKey(num[i])) {
                map.put(num[i], map.get(num[i]) + 1);
            } else {
                map.put(num[i], 1);
            }
        }
        for (int key : map.keySet()) {
            // to print numbers that are occuring more than n
            if (map.get(key) > 2) {
                System.out.println(key + " -- " + map.get(key) + " times");
            }
        }
    }
}

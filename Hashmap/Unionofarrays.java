package hashmap;

import java.util.*;
public class Unionofarrays {
    public static void union(int[] ar1, int[] ar2) {
        Set<Integer> map= new HashSet<>();
        for(int i:ar1){
            map.add(i);
        }
        for (int i : ar2) {
            map.add(i);
        }
        System.out.println(map.size()+" "+map);
    }
    public static void main(String[] args) {
        int[] ar1 = {1, 2, 3, 4, 5};
        int[] ar2 = {2, 3, 4};
        union(ar1, ar2);
    }
}
package arrays;

import java.util.ArrayList;

public class ArrayListClass {
    static void ListExplained(ArrayList<Integer> list) {

        // add
        list.add(1);
        list.add(2);
        list.add(2, 3);
        // System.out.println(list);
        // remove with index
        list.remove(1);
        // System.out.println(list);
        // update
        list.set(0, 5);
        // System.out.println(list);
        // get
        // int element=list.get(0);
        // System.out.println(element);
        // print
        System.out.println(list);
    }
 }

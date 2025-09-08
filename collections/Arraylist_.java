package collections;

import java.util.ArrayList;

public class Arraylist_ {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

//        add
        list.add(1);
        list.add(12);
        list.add(13);
//        list.addAll();
//        set
        list.set(1, 2);
//        get
        System.out.println(list.get(1));
        // Removes
        list.remove(1);
//       search
        list.indexOf(1);
        list.lastIndexOf(2);
    }
}

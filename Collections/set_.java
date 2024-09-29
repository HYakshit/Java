package Collections;
import java.util.HashSet;
import java.util.Set;

public class set_ {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();

        // Adding elements
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(10); // Duplicate, will not be added

        // Iterating through the set
        for (Integer num : set) {
            System.out.println(num);
        }

        // Checking if an element exists
        if (set.contains(20)) {
            System.out.println("Set contains 20");
        }

        // Removing an element
        set.remove(30);
        System.out.println("After removing 30: " + set);

    }
}

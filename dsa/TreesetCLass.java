package DSA;
import java.util.List;
import java.util.TreeSet;
public class TreesetCLass {
    public static void main(String[] args) {
        TreeSet<Integer> tset=new TreeSet<>(List.of(10, 20, 30, 40));
        tset.add(12);
        tset.add(1);
        tset.add(2);
        tset.add(14);

        System.out.println(tset.higher(20)); // Output: 30

        System.out.println(tset.lower(30)); // Output: 20
        TreeSet<Integer> set = new TreeSet<>(List.of(10, 20, 30, 40));
//        ceiling , less than equal to
        System.out.println(set.ceiling(25)); // Output: 30
        System.out.println(set.ceiling(30)); // Output: 30

//        Returns the largest element less than or equal to the given element.
        System.out.println(set.floor(25)); // Output: 20
        System.out.println(set.floor(30)); // Output: 30

//        headSet
//        Returns elements that are less than passed element.
        System.out.println(tset.headSet(30));

//Returns elements that are greater than or equal to fromElement.
        System.out.println(set.tailSet(30)); // Output: [30, 40, 50]

//        Returns elements from fromElement (inclusive) to toElement (exclusive).
        System.out.println(set.subSet(20, 50)); // Output: [20, 30, 40]
    }
}

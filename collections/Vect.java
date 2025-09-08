package Collections;
import java.util.Vector;

public class Vect {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        vector.add("Red");
        vector.add("Green");
        vector.add("Blue");

        // Accessing elements
        System.out.println("Element at index 2: " + vector.get(2));

        // Iterating through the vector
        for (String color : vector) {
            System.out.println(color);
        }

        // Removing an element
        vector.remove("Green");
        System.out.println("After removing Green: " + vector);
    }
}

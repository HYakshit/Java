package Collections;
import java.util.LinkedList;

public class Linkedlist_ {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Dog");
        linkedList.add("Cat");
        linkedList.add("Rabbit");
        linkedList.add("bandar");
        // Accessing elements
        System.out.println("First element: " + linkedList.getFirst());

        // Adding an element at the start
        linkedList.addFirst("Lion");

        linkedList.addLast("akshit");

        // Iterating through the list
        for (String animal : linkedList) {
            System.out.println(animal);
        }

        // Removing an element
        linkedList.remove("Cat");
        linkedList.removeLast();
        linkedList.removeFirst();

        System.out.println("After removing Cat: " + linkedList);
    }
}

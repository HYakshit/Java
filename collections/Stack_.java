package Collections;
import java.util.Stack;

public class Stack_{
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("First");
        stack.push("Second");
        stack.push("Third");

        // Peek at the top element
        System.out.println("Top element: " + stack.peek());

        // Pop an element
        stack.pop();
        System.out.println("After popping, top element: " + stack.peek());

        // Iterating through the stack
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}

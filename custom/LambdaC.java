import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

//A Lambda expression is a feature in Java (introduced in Java 8) that lets you write shorter,
// cleaner code to implement functional interfaces (interfaces with a single abstract method).
//It is used primarily to pass behavior (functions) as parameters, often used with Collections,
// Streams, or functional-style programming.
class LambdaC{
    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<>(Arrays.asList(1,2,3,4));

        list.forEach(element -> System.out.println(element*element));
    }
}
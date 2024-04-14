import java.util.ArrayList;
import java.util.Scanner;

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

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        // ListExplained(list);

        Scanner in = new Scanner(System.in);
        int element = 0,sum=0, i = 0;
        while (element != -1) {
            System.out.println("enter " + (++i) + "st number (-1 to exit)");
            element = in.nextInt();
            if (element != -1) {
                list.add(element);
            }
        }
       for (int j = 0; j < list.size(); j++) {
        sum+=list.get(j);
       }
        System.out.println("sum is"+sum+" list size is"+list.size());
    
    }
}

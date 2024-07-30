import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LargestInput {
    public static void largest() {
        int num, sum = 0;
        int largest = 0;
        List<Integer> intList = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter numbers(0 to exit)");
        while (true) {
            num = in.nextInt();
            if(num==0){
                break;
            }
            if (num > largest) {
                largest = num;
            }
        }
        System.out.println(largest);
    }
    public static void main(String[] args) {
        largest();
    }
}

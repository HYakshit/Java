import java.util.Scanner;

public class Tobinary {

    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        System.out.println("Enter a number: ");
//        int num = in.nextInt();
        int num = 5;

        String binary = "";
        while (num != 0) {
            int digit = num % 2;
            // digit is msb
            binary = digit + binary;
            num = num / 2;
        }

        System.out.println("The binary representation of " + num + " is " + binary);
    }
}

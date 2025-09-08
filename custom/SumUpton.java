package custom;

import java.util.Scanner;

public class SumUpton {
    public static void listSum() {
        int sum=0;
        Scanner in=new Scanner(System.in);
        while (true) {
            System.out.print("Enter a number (or 'x' to stop): ");
            String input = in.nextLine();

            if (input.equalsIgnoreCase("x")) {
                break;
            }

            try {
                int number = Integer.parseInt(input);
                sum += number;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number or 'x' to stop.");
            }
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        listSum();
    }
}

import java.util.Scanner;

public class Prime_freq {
    public static void main(String[] args) {
        int i;
        int[] a = new int[10];
        Scanner aja = new Scanner(System.in);
        System.out.print("Enter Prime Numbers\t");
        for (i = 0; i < a.length; i++) {
            a[i] = aja.nextInt();
        }
        for (int num : a) {
            System.out.print(num + "- ");
            String numStr = String.valueOf(num);
            for (i = 0; i < numStr.length(); i++) {
                int digit = Character.getNumericValue(numStr.charAt(i));
                int frequency = 0;
                for (int j = 0; j < numStr.length(
                ); j++) {
                    if (digit == Character.getNumericValue(numStr.charAt(j))) {
                        frequency++;
                    }

                }
                System.out.print(digit + "/" + frequency + " times ");
                i += (frequency - 1);
            }
            System.out.println();
        }
        aja.close();
    }
}
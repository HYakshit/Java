import java.util.*;

public class Patterens {
    public void p1(int n) {
        // 1
        // 22
        // 333
        // 4444
        int lines = n;
        for (int i = 1; i <= lines; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.print("\n");
        }
    }

    void pyramid(int n) {
        int rows = n;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }

            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

class mainClass {
    public static void main(String[] args) {
        Scanner aja = new Scanner(System.in);
        Patterens obj = new Patterens();
        System.out.println("how many lines:");
        int lines = aja.nextInt();
        // p1
        // obj.p1(lines);

        // pyramid
        obj.pyramid(lines);

        aja.close();
    }
}

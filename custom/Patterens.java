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
//   1
//  212
// 32123
//4321234
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

    void p2(int n) {
        int Aascii = (int) 'A';
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print((char) ('A' + j) + " ");
            }
            System.out.println();
        }

    }

    void p3(int n) {
//        Input: ‘N’ = 3
//
//        Output:
//
//  *
// ***
//*****
//*****
// ***
//  *
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {//left side of triangle
                System.out.print(" ");
            }

            for (int j = 0; j <= i; j++) {// left *
                System.out.print("*");
            }
            for (int j = 0; j <= i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n; i > 0; i--) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < i - 1; j++) {
                System.out.print("*");
            }
            for (int j = 0; j <= i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


    }

    void p4(int n) {
//        Input: ‘N’ = 3
//
//        Output:
//
//  *
// ***
//*****
//*****
// ***
//  *
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {// stars *
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n - 1; i > 0; i--) {
            for (int j = 0; j <= i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


    }

    void p5(int n) {
//        Input: ‘N’ = 3
//
//Output:
//
//1
//0 1
//1 0 1
        boolean istrue = false;
        for (int i = 0; i < n; i++) {
            istrue = !istrue;
            System.out.print(istrue ? 1 + " " : 0 + " ");
            boolean output = !istrue;
            for (int j = 0; j < i; j++) {
                if (output) {
                    System.out.print(1 + " ");
                } else {
                    System.out.print(0 + " ");
                }
                output = !output;

            }
            System.out.println();

        }
    }

    void p6(int n) {
//        Input: ‘N’ = 3
//
//        1             1
//        1 2         2 1
//        1 2 3     3 2 1
//        1 2 3 4 4 3 2 1
        for (int i = 1; i <= n; i++) {
            // Print increasing numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }

            // Print spaces (2 * (n - i)) times
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print("  "); // two spaces
            }

            // Print decreasing numbers
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }

            System.out.println(); // Move to next line
        }

    }

    void p7(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == 4) {
                    System.out.println("*");
                }
                if (j == 0 || j == 4) {
                    System.out.print("*");
                }

            }
            System.out.println();
        }

    }
    void p8(int row){
        int roww=row;
        for (int i =0 ; i <roww; i++) {
            System.out.print(roww);
            for (int j = roww-i-1; j >0; j--) {
                System.out.print(j);

            }
           System.out.print(roww-i);
            System.out.println();
        }
    }
}

class mainClass {
    public static void main(String[] args) {
        Scanner aja = new Scanner(System.in);
        Patterens obj = new Patterens();
        System.out.println("how many rows:");
        int rows = aja.nextInt();
        // p1
        // obj.p1(lines);

        // pyramid
//        obj.pyramid(rows);

//        obj.p2(rows);
//        obj.p3(rows);
//        obj.p4(rows);
        obj.p8(rows);
    }
}

package custom;

public class Matrix {
    //    Given an N x N matrix, rotate it by 90 degrees clockwise in-place.
//
//            Input:
//            1  2  3
//            4  5  6
//            7  8  9
//
//    Output:
//            7  4  1
//            8  5  2
//            9  6  3
    public static void main(String[] args) {
        int[][] ar = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
//transpose
        for (int i = 0; i < ar.length - 1; i++) {
            for (int j = i + 1; j < ar[i].length; j++) {
                int temp = ar[i][j];
                ar[i][j] = ar[j][i];
                ar[j][i] = temp;

            }
        }

//        reverse each row
        for (int i = 0; i < ar.length; i++) {
            int n=ar.length-1;
            for (int j = 0; j < (ar[i].length)/2; j++) {
                int temp=ar[i][j];
                ar[i][j]=ar[i][n];
                ar[i][n]=temp;
                n--;
            }

        }

        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar.length; j++) {
                System.out.print(ar[i][j] + " ");

            }
            System.out.println();
        }

    }
}

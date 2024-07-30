package arrays;

public class Matrixmultipication {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] matrix2 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] matrix3 = new int[matrix.length][matrix.length];

        for (int row = 0; row < matrix.length; row++) {
            for (int rowcol = 0; rowcol < matrix[row].length; rowcol++) {
                matrix3[row][rowcol] = matrix[row][rowcol] * matrix2[rowcol][row];
                System.out.print(" " + matrix3[row][rowcol]);
            }
            System.out.println();
        }

    }
}

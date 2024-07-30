package strings;

public class MatrixReversal {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("Original Matrix:");
        printMatrix(matrix);

        int[][] reversedMatrix = reverseMatrix(matrix);

        System.out.println("\nReversed Matrix:");
        printMatrix(reversedMatrix);
    }

    // Method to reverse the matrix
    static int[][] reverseMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] reversedMatrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                reversedMatrix[i][j] = matrix[rows - 1 - i][cols - 1 - j];
            }
        }

        return reversedMatrix;
    }

    // Method to print a matrix
    static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}

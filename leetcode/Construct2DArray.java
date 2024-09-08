package leetcode;

public class Construct2DArray {
    public static void main(String[] args) {
        int[][] output = construct2DArray(Input.arr1, 2, 2);
        for (int[] i : output) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println("\n");
        }
    }

    public static int[][] construct2DArray(int[] original, int m, int n) {

        if (m * n != original.length) {
            return new int[][]{};
        }
        int[][] result = new int[m][n];
        int index = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                result[i][j] = original[index++];
            }
        }
        return result;
    }
}

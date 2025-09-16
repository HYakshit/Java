package practical;
import java.util.*;

public class Q1_MultiDimArrayInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        int[][] arr = new int[rows][cols];

        System.out.println("Enter elements row-wise:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.printf("arr[%d][%d] = ", i, j);
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nMatrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.printf("%5d", arr[i][j]);
            }
            System.out.println();
        }

        // Example extra operation — compute row sums and total sum
        int total = 0;
        System.out.println("\nRow sums:");
        for (int i = 0; i < rows; i++) {
            int rowSum = 0;
            for (int j = 0; j < cols; j++) rowSum += arr[i][j];
            System.out.println("Row " + i + " sum = " + rowSum);
            total += rowSum;
        }
        System.out.println("Total sum of all elements = " + total);

        sc.close();
    }
}

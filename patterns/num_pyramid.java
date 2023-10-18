package patterns;
import java.util.Scanner;
public class num_pyramid {
    public static void main(String[] args) {
        int rows;
        System.out.println("how many lines:");
        Scanner in= new Scanner(System.in);
         rows=in.nextInt();
         for (int i=1;i<=rows;i++){
             for (int j=1;j<=rows-i;j++){
                 System.out.print(" ");
             }
             for(int j=i;j>=1;j--){
                 System.out.print(j);
             }


             for (int j=2;j<=i;j++){
                 System.out.print(j);
             }
             System.out.println();
         }


    }
}

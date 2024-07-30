import java.util.InputMismatchException;
import java.util.Scanner;

public class TimeSum {
  public static void main(String[] args) {
    int h = 0, m = 0, s = 0;
    System.out.println("Enter time in H:1 M:1 S:1 format (c to calculate)");
    Scanner in = new Scanner(System.in);
    try {
      // Get input
      while (h >24) {
        h = in.nextInt();
        m = in.nextInt();
        s = in.nextInt();
        if(s>59){
          m+=1;
        }else{
          s+=s;
        }
        if(m>59){
          h+=1;
        }else{
          h+=h;
        }

      }
    } catch (InputMismatchException e) {
      System.out.print("Invalid Input");
    }

  }
}
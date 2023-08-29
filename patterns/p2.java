package patterns;

import java.util.*;
public class p2
{
    public static void main(String[] args)
    {
        int lines,i,j;
        Scanner aja = new Scanner(System.in);
        System.out.println("how many lines:");
        lines =aja.nextInt();
       for(i=1;i<=lines;i++){
       for(j=1;j<=i;j++){
        System.out.print(j+" ");
       }
        System.out.print("\n");}

    }
}
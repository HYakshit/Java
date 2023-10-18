import java.util.Arrays;
import java.util.Scanner;

public class solution {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
  boolean ans=true;
        System.out.println("enter two strings");
        String s= in.nextLine();
        String a= in.nextLine();
        char[] ch;
        char[] ab;
       ch= s.toCharArray();
       ab=a.toCharArray();
       Arrays.sort(ch);
       Arrays.sort(ab);
       if(ch.length!=ab.length){
           ans=false;

       }else {
           for (int i = 0; i < ch.length; i++) {
               if (ch[i] != ab[i]) {
                   ans = false;
                   break;
               }
           }
       }
           if (ans) {
               System.out.println("hai");
           } else {
               System.out.println("nhi ha");
           }

    }


}

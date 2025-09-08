package DSA;

import java.util.Scanner;

import static java.lang.Math.max;

public class Slidingwindow {
    public static void main(String[] args) {
        int[] ar={1,2,3,4,5,7,7};
        int k, maxsum=0,finalmax=0,ss=0;
        Scanner in=new Scanner(System.in);
       k= in.nextInt();

        for (int i = 0; i < k; i++) {
            ss+=ar[i];
        }
        maxsum=ss;
        for (int i = k; i < ar.length; i++) {
            maxsum+=ar[i]-ar[i-k];
            finalmax=max(maxsum,ss);
        }
        System.out.println(finalmax);
    }

    
}

package strings;

import java.util.Scanner;

class Stringoutput{
    public static void main(String[] args) {
        String[] x={"apple","m-ax","cat"};
        int limit;
        System.out.println("enter n");
        Scanner in=new Scanner(System.in);
        limit=in.nextInt();
        int i=0;
        int index=0;
        while(i<limit){
            if(index>x.length-1){
                index=0;
            }
            System.out.println(x[index]);
            index++;
            i++;
        }
    }
}
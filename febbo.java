import java.util.Scanner;

public class febbo {
    public static void fibo(int limit) {
int num1=0,num2=1;
        System.out.print(num1+" "+num2);
        for(int i=1;i<limit;i++){
            int temp=num1+num2;
            System.out.print(" "+temp);
            num1=num2;
            num2=temp;

        }
    }
    public static void main(String[] args) {
        Scanner aja=new Scanner(System.in);
        int limit;
        System.out.println("enter Limit");
        limit=aja.nextInt();
        fibo(limit);


    }
}

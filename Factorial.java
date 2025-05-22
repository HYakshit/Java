import java.util.Scanner;
public class




Factorial{
    public static void main(String[] args)
    {
        int num,fact=1,i=1;
        Scanner aja=new Scanner(System.in);
        System.out.println("Enter the number");
        num=aja.nextInt();
        if(num==1){
            System.out.println("Factorial of number " +num+ " is " +fact);
        }
        while(i<=num){
            fact=fact*i;
            i++;
        }
        System.out.println("Factorial of number " +num+ "is " +fact);
    }
}
import java.util.Scanner;
public class Freqofdigit
{
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        int i,a,num,numcount1=0,numcount2=0,numcount3=0,num1=0,num2=0,num3=0;
        int[] ar=new int[10];
        System.out.println("Enter the elements of the array");
        for( i=0;i<10;i++){
            ar[i]=x.nextInt();
        }
        System.out.println("Frequency of digits in number is: ");
        for(i=0;i<10;i++){
            int integer=ar[i];
            a=integer;
            num1=a%10;
            a=a/10;
            num2=a%10;
            if(num2==num1){
                num2=num1;
            }
            a=a/10;
            num3=a%10;
            if(num3==num1)
            {
                num3=num1;
            }
            numcount1=0;
            numcount2=0;
            numcount3=0;
            while(integer>0)//jhj
            {
                a=integer;
                num=integer%10;

                if(num==num1)
                    numcount1=numcount1+1;
                else if(num==num2)
                    numcount2=numcount2+1;
                else
                    numcount3=numcount3+1;

                integer=integer/10;


            }
            System.out.println("frequency of" +num1+ " :Is:"+numcount1+" Frequency of :" +num2+ "is :"+numcount2+" Frequency of :" +num3+ "is :"+numcount3) ;
        }
    }

}
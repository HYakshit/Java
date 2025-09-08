package leetcode;
class Rev7 {
    public int reverse(int x) {
        int number=x,rem=0;
        double reversed=0;
        while(number>0){
            rem=number%10;
            reversed=reversed*10+rem;
            number/=10;
        }
        double min=  Math.pow(2,31);
        double max= Math.pow(2,31)-1;
        if(reversed<min || reversed>max){
return 0;
        }
        return (int)reversed;
    }

}

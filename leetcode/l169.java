package leetcode;

class Solution {
    public static void main(String[] args) {
       int n= trailingZeroes(13);
        System.out.println(n);
    }
    public static int trailingZeroes(int n) {
        int count=0;
       long re,fact=1;
        if(n<=2){
            return 0;

        }
        while(n>0){

            fact=fact*n;
            n=n-1;
        }
        re=fact%10;
        while(re==0){
            re=fact%10;
            fact=fact/10;

            count++;
        }
        if(count>0){
            return count-1;
        }return 0;
    }
}
package leetcode;

public class L2240 {
    public static void main(String[] args) {
       long a= waysToBuyPensPencils(20,10,5);
    }
    public static long waysToBuyPensPencils(int total, int cost1, int cost2) {
        int count=1;
        while(cost1!=0){
            while (total!=0){
                int max=total/cost1;
                if(max==0){
                    break;
                }
                else {

                }
            }
        }
        return count;
    }
}
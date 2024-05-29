/**
 * RemoveArray
 */
public class RemoveDuplicates {

    public static void removeDuplicates(int[] nums) {
        int j = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != nums[i + 1]) {
                nums[j] = nums[i];
                j++;
            }
        }
//        if(nums[j] != nums[j+1]){
//        nums[j]=nums[]
//        }


        for (int i = 0; i < j; i++) {
            System.out.println(nums[i]);
        }

    }



     public static int[] getConcatenation(int[] nums) {
         int len = (nums.length) * 2;
         int[] ans = new int[len];
         for (int i = 0, j = 0; i < nums.length; i++) {
             if(j>=nums.length){
                 j=0;
             }
             ans[i] = nums[j++];
         }
         return ans;
     }

    public static void main(String[] args) {
        int[] ar2 = {1,2,4,4, 7, 3,3};
         removeDuplicates(ar2);
//        int[] ans = getConcatenation(ar2);
//        for (int i : ans) {
//            System.out.println(i);
//        }
    }
}
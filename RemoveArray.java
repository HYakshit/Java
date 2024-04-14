/**
 * RemoveArray
 */
public class RemoveArray {

    public static void removeDuplicates(int[] nums) {
        int j = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != nums[i + 1]) {
                nums[j] = nums[i];
                j++;
            }
        }
        nums[j++] = nums[nums.length];
        for (int i = 0; i < j; i++) {
            System.out.println(nums[i]);
        }

    }

 
        public static int[] getConcatenation(int[] nums) {
            int len=nums.length;;
            int[] ans = new int[len*2];        
            for(int i=len;i<ans.length;i++){   
                 ans[i-len] = nums[i-len];   
                 ans[i] = nums[i-len];      
            }
            return ans;  
        }
    

    // public static int[] getConcatenation(int[] nums) {
    //     int len = (len) * 2;
    //     int[] ans = new int[len];
    //     for (int i = 0, j = 0; i < nums.length; i++) {
    //         if(j>=nums.length){
    //             j=0;
    //         }
    //         ans[i] = nums[j++];
   
    //     }
    //     return ans;
    // }

    public static void main(String[] args) {
        int[] ar2 = { 1, 7, 3 };
        // removeDuplicates(ar2);
        int[] ans = getConcatenation(ar2);
        for (int i : ans) {
            System.out.println(i);
        }
    }
}
/**
 * RemoveArray
 */
public class RemoveArray {

public static void removeDuplicates(int[] nums) {
    int j = 0;
    for (int i = 0; i < nums.length; i++) {
        if (nums[i] != nums[i - 1]) {
            nums[j] = nums[i];
            j++;
        }
    }
    for (int i : nums) {
        
        System.out.println(i);
    }
   
}

    public static void main(String[] args) {

        int[] ar2 = { 1, 7, 3, 3, 4, 5, 4,3, 6 };
        removeDuplicates(ar2);
    }
}
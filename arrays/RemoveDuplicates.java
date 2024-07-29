package arrays;

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
        for (int i = 0; i < j; i++) {
            System.out.println(nums[i]);
        }

    }

    public static void main(String[] args) {
        Arrayhelper arrayhelper = new Arrayhelper();
        int[] ar1 = {1, 2, 4, 4, 7, 3, 3};
        int[] ar2 = {2, 2, 2, 2, 2};
//        removeDuplicates(ar2);
    }
}
package leetcode;

public class ArraySign {
    public static void main(String[] args) {
        System.out.printf("Array product is %d",arraySign(Input.bothSignArr));
    }

    public static int arraySign(int[] nums) {
//        1822
//        There is a function signFunc(x) that returns:
//1 if x is positive
//-1 if x is negative.
//0 if x is equal to 0.
//You are given an integer array nums. Let product be the product of all values in the array nums.
//Return signFunc(product).

        int count = 0, sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                return 0;
            }
            if (nums[i] < 0) {
                count++;
            }
        }
        if (count % 2 == 0) {
            return 1;
        }
        return -1;
    }
}

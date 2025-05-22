public class RemoveDuplicates {

    public static void removeDuplicates(int[] nums) {
        int[] unique = new int[nums.length];
        int k = 0;

        for (int i = 0; i < nums.length; i++) {
            boolean found = false;
            for (int j = 0; j < k; j++) {
                if (nums[i] == unique[j]) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                unique[k++] = nums[i];
            }
        }

        for (int i = 0; i < k; i++) {
            System.out.println(unique[i]);
        }
    }

    public static void main(String[] args) {
        int[] ar1 = {1, 2, 4, 4, 7, 3, 4, 3};
        removeDuplicates(ar1);
    }
}

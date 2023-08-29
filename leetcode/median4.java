package leetcode;


class median4 {
    public static void main(String[] args) {
        int[] num ={1,4,5}; int[] num2={2,3,6,7,8,9};
        System.out.println(findMedianSortedArrays(num, num2));
    }
    public static float findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] c = new int[(nums1.length + nums2.length)];
        int k = 0, i = 0, j = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                c[k] = nums1[i];
                i++;
            } else {
                c[k] = nums2[j];
                j++;
            }
            k++;
        }
        while(i < nums1.length){
            c[k] = nums1[i];
            i++;
            k++;
        }
        while(j < nums2.length){
            c[k] = nums2[j];
            j++;
            k++;
        }
        float ans = 0;
        if(c.length % 2 == 0){
            ans = (float) (c[(c.length / 2)] + (c[(c.length / 2) + 1])) / 2;
        }
        else{
            ans  = c[(c.length / 2)];
        }
        return ans;
    }
}
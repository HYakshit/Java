package leetcode;

public class MedianSortedArrays {
    public static void main(String[] args) {
        float output=medianSortedArrays(Input.sorted1Arr,Input.sorted2Arr);
        System.out.println(output);
    }
    public static float medianSortedArrays(int[] nums1, int[] nums2) {
        // 4
        // Given two sorted arrays nums1 and nums2 of size m and n respectively, return
        // the median of the two sorted arrays.
        // The overall run time complexity should be O(log (m+n)).
        // Example 1:

        // Input: nums1 = [1,3], nums2 = [2]
        // Output: 2.00000
        // Explanation: merged array = [1,2,3] and median is 2.
        int[] c = new int[(nums1.length + nums2.length)];
        int k = 0, i = 0, j = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                c[k] = nums1[i];
                i++;
                k++;
            } else {
                c[k] = nums2[j];
                j++;
                k++;
            }
        }

        while (i < nums1.length) {
            c[k] = nums1[i];
            i++;
            k++;
        }
        while (j < nums2.length) {
            c[k] = nums2[j];
            j++;
            k++;
        }
        float ans = 0;
        int arrayLength = c.length;
        if (arrayLength % 2 == 0) {
            int first = arrayLength / 2 - 1;
            int second = (arrayLength / 2);
            return (float) ((c[first] + c[second]) / 2.0f);
        } else {
            int index = arrayLength / 2;
            ans = c[index];
            return ans;
        }
    }
}

package arrays;

public class Arrayhelper {

    public void printAr(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    public int[] copy(int[] arr) {
        int size = arr.length;
        int[] result = new int[size];
        for (int i = 0; i < arr.length; i++) {
            result[i] = arr[i];
        }
        return result;
    }
    public static int[] concatArray(int[] array1, int[] array2) {
        int len = array1.length+array2.length;
        int[] ans = new int[len];
        for (int i = 0, j = array1.length; i < len; i++) {
            if (i< array1.length) {
                ans[i] = array1[i];
            }else{
                int index2=0;
                if(j<len){
                    ans[j]=array2[index2];
                }
                j++; index2++;
            }
        }
        return ans;
    }
    public int sumArray(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
}

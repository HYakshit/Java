package arrays;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class EleSum {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] arr2 = {1, 2, 4, 4, 5, 6, 7, 8};
        ArrayList<Integer> arr3 = new ArrayList<>();
        for (int i = arr.length - 1; i >= 0; i--) { // ✅ Start from arr.length - 1
            int sum = arr[i] + arr2[i];


            if (sum > 9) {
                String temp = String.valueOf(sum);
                String[] sumstr=temp.split("");
                arr3.add(Integer.parseInt(sumstr[1]));
                arr3.add(Integer.parseInt(sumstr[0]));

            }else{
                arr3.add(sum);
            }
        }
        Collections.reverse(arr3);
    for(int i:arr3){
            System.out.print(i+" ");
        }
    }

}

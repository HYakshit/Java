package leetcode;

import java.util.ArrayList;

public class KthDistinct_2053 {
    public static void main(String[] args) {
        String[] data= {"d","b","c","b","c","a"};
        kthDistinct(data,2);
    }

    public static void kthDistinct(String[] arr, int k) {
        ArrayList<String> uniqueStrs= new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            boolean isUnique=true;
            int j;
            String str=arr[i];
            for (j = i+1; j < arr.length ; j++) {
                if(str==arr[j]){
                    isUnique=false;
                    break;
                }else if(j== arr.length-1 && isUnique){
                    uniqueStrs.add(arr[i]);
                }
            }
            System.out.println(uniqueStrs);
        }
    }
}

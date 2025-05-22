package DSA;

public class QuickSort {
    public int[] quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
        return arr;
    }

    int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i]; arr[i] = arr[j]; arr[j] = temp;
            }
        }
        int temp = arr[i + 1]; arr[i + 1] = arr[high]; arr[high] = temp;
        return i + 1;
    }
}
class main{
    public static void main(String[] args) {
        QuickSort obj=new QuickSort();
        int[] ar={3,1,4,6,9,2};
        int[] result= obj.quickSort(ar,0, ar.length-1);
        for (int i:result){
            System.out.println(i);
        }

    }

}

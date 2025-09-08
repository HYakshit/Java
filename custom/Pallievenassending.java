public class Pallievenassending {
    static boolean palli(int num) {
        int orig = num;
        int rev=0;
        while (num > 0) {
            int rem = num % 10;
            rev = rev * 10 + rem;
            num = num / 10;
        }
        return orig == rev;
    }

    public static void main(String[] args) {
        int[] ar = { 22, 2, 3, 44, 5, 6, 7, 88, 9, 10 };
        int[] result = new int[ar.length];
        int index=0;
        for (int i = 0; i < ar.length; i++) {
            //to check pallindrome
            if (palli(ar[i])) {
                //to check even
                if (ar[i]%2==0) {
                    //to store numbers
                    result[index] = ar[i];
                    index++;

                }
            }
        }
// to sort array
        for (int i = 0; i < result.length; i++) {
            for (int j = i + 1; j < result.length; j++) {
                if (result[i] > result[j]) {
                    int temp = result[i];
                    result[i] = result[j];
                    result[j] = temp;
                }
            }
        }
        System.out.println("Pallindrome even no in assending order");
        for (int i : result) {
            if(i!=0) System.out.println(i);
        }
    }

}

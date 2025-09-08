public class LcmHcf {
    public static int[] lcmHcf(int num1, int num2) {
        int[] ar = {1, 1};
//        lcm
        int lcm = Math.max(num1, num2);
        while (true) {
            if (lcm % num1 == 0 && lcm % num2 == 0) {
                ar[0] = lcm;
                break;
            }
            lcm++;
        }

        int min = Math.min(num1, num2);
        int a = 0;
        for (int i = min; i > 0; i--) {
            if (num1 % i == 0 && num2 % i == 0) {
                ar[1] = i;
                break;
            }
        }
        return ar;
    }

    public static void main(String[] args) {
        for (int i : lcmHcf(2, 6)) {
            System.out.println(i);
        }

    }
}

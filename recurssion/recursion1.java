package recurssion;

public class recursion1 {
    public static void main(String[] args) {
        int num = 5;
        int fac = factorial(num);

        System.out.println(fac);
    }

    public static int factorial(int num) {
        if (num == 0) {
            return 1;
        } else {
            return num * factorial(num - 1);
        }
    }
}

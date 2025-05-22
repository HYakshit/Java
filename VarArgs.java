import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(1,8,9);
        multiple(2,3, "Kunal", "Rahul", "dvytsbhusc");
    }


    static void multiple(int a, int b, String... stringValues) {
        System.out.println(a+""+b+"\t"+Arrays.toString(stringValues));
    }

    static void fun(int... intValues) {
        System.out.println(Arrays.toString(intValues));
    }
}


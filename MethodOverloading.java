public class MethodOverloading {
    // 1. Overloading a method with the same name but different number of parameters
    public static void main(String[] args) {
        System.out.println(sum("a","b"));
    }
    static int sum(int a,int b){
        return a+b;
    }
    static double sum(double a,double b){
        return a+b;
    }
    static String sum(String a,String b){
        return a+b;
    }
}

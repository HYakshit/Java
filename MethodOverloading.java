public class MethodOverloading {
    static void sum(int a,int b){
        System.out.println("sum(int a,int b)"+(a+b));
    }
    static void sum(double a,double b){
        System.out.println("sum(double a,double b)"+(a+b));
    }
    static void sum(String a,String b){
        System.out.println("sum(String a,String b)"+(a+b));
    }
    public static void main(String[] args) {
        sum(2,3);
    }
}

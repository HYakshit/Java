public class fibboUptoN {
    public static void febbo(int num){
        int next = 0;
        int first = 0, second = 1;
        System.out.println("fibonacci Series:" + first + " " + second);
        while (next < num) {
            next = first + second;
            System.out.print(" " + next);
            first = second;
            second = next;

        }
    }
    public static void main(String[] args) {
febbo(10);
    }
}


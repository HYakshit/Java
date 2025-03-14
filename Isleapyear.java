public class Isleapyear {
    public static boolean isLeap(int y) {
        if (y % 4 == 0) {
            if (y % 100 == 0) {
                return y % 400 == 0;
            } else {
                return true;
            }

        } else {
            return false;
        }

    }

    public static void main(String[] args) {
        System.out.println(isLeap(2024));
    }
}

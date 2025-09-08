package leetcode;

public class ChalkReplacer {
    public static void main(String[] args) {

        System.out.println(chalkReplacer(new int[]{3,4,1,2}, 25));
    }

    public static int chalkReplacer(int[] chalk, int k) {
        int chalksNumber = k;
        while (true) {
            for (int i = 0; i < chalk.length; i++) {
                System.out.println(chalksNumber+" --- "+chalk[i]);
                if (chalksNumber < chalk[i]) {
                    return i;
                }
                chalksNumber = chalksNumber - chalk[i];
            }
        }
    }
}

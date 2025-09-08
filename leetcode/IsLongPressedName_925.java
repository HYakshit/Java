package leetcode;

public interface IsLongPressedName_925 {
    public static void main(String[] args) {
        System.out.println( isLongPressedName("leelee", "lleeelee"));
    }

    public static boolean isLongPressedName(String name, String typed) {
        boolean result = true;
        char[] nameArr = name.toCharArray();
        char[] typedArr = typed.toCharArray();
        int j = 0;
        for (int i = 0; i < nameArr.length; i++) {
            if(i>0 && nameArr[i]==nameArr[i-1]){
                continue;
            }
            int correctCount = 0;
            while (j < typedArr.length && nameArr[i] == typedArr[j]) {

                    correctCount++;
                    j++;

            }
            if (correctCount == 0) {
                result = false;
                break;
            }
        }
        return result;
    }


}

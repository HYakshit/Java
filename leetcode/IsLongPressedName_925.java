package leetcode;

public interface IsLongPressedName_925 {
    public static void main(String[] args) {
        isLongPressedName("akshit", "aakshiiiiitt");
    }

    public static boolean isLongPressedName(String name, String typed) {
        boolean result = false;
        char[] nameArr = name.toCharArray();
        char[] typedArr = typed.toCharArray();
        for (int i = 0; i < nameArr.length; i++) {
            for (int j = i; j < typedArr.length; j++) {

            }
        }
        return true;
    }


}

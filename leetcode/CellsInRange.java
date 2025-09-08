package leetcode;

import java.util.ArrayList;
import java.util.List;

public class CellsInRange {
    public static void main(String[] args) {
        String str="a1:h8";
        System.out.println(cellsInRange(str));
    }
    public static List<String> cellsInRange(String s) {
        List<String> list = new ArrayList<>();
        char startCharacter = s.charAt(0);
        char endCharacter = s.charAt(3);
        int startNumber = s.charAt(1) - '0';
        int endNumber = s.charAt(4) - '0';

        for (char i = startCharacter; i <= endCharacter; i++) {
            for (int j = startNumber; j <= endNumber; j++) {
                list.add("" + i + j);
            }
        }
        return list;
    }
}

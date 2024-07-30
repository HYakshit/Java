package strings;

import java.util.Arrays;
import java.util.Scanner;
// Anagrag is if all characters are present in another array
public class AnagramChecker {

    public static void main(String[] args) {
        String str1,str2;
        Scanner aja=new Scanner(System.in);
        System.out.println("enter two strings");
        str1=aja.nextLine();
        str2=aja.nextLine();


        if (isAnagram(str1, str2)) {
            System.out.println(str1 + " and " + str2 + " are anagrams.");
        } else {
            System.out.println(str1 + " and " + str2 + " are not anagrams.");
        }
        aja.close();
    }

    static boolean isAnagram(String str1, String str2) {

        if (str1.length() != str2.length()) {
            return false;
        }

        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        for (int i = 0; i < ch1.length; i++) {
            if (ch1[i] != ch2[i]) {
                return false;
            }
        }

        return true;
    }

}

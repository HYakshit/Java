package strings;

public class SubStrCheck {
    public static boolean canConstruct(String ransomNote, String magazine) {
        if(ransomNote.contains(magazine)){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {
        String s="akshit";
        String b="sh";
        System.out.println(canConstruct(s,b));
    }
}

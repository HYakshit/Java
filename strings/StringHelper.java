package strings;

public class StringHelper {
    private StringBuilder builder;
//
//    StringHelper(String sendedString) {
//        builder = new StringBuilder(sendedString);
//    }

   public void trim(String str) {
        for (int i = 0; i < str.length(); i++) {
            builder= new StringBuilder(str);
            System.out.println(builder.charAt(i));
        }
    }

}

import java.util.Arrays;
import java.util.List;

public class ExplicitConversionExample {
    public static void main(String[] args) {

        // Explicit casting from double to int
        double doubleValue = 10.75;
        int intValue = (int) doubleValue;
        System.out.println("Double to Int: " + intValue);

        // Explicit casting from int to char
        int intValueToChar = 65;
        char charValueFromInt = (char) intValueToChar;
        System.out.println("Int to Char: " + charValueFromInt);

//        to int
        // Explicit casting from char to int
        char charValue = 'A';
        int intValueFromChar = (int) charValue;
        System.out.println("Char to Int: " + intValueFromChar);

        // Convert String to Array
        String str = "akshit Mahajan";
        char[] strArray = str.toCharArray();
        System.out.print("String to Array: ");
        for (char c : strArray) {
            System.out.print(c);
        }
        // Convert String number to int
        String intString = "123";
        int parsedInt = Integer.parseInt(intString);
        System.out.println("String to Int: " + parsedInt);


        // to strings
        // Convert int to String
        int int1 = 42;
        String stringValue = Integer.toString(int1);
        System.out.println("Int to String: " + stringValue);

        // Convert double to String
        double double1 = 3.14;
        String doubleStringValue = Double.toString(double1);
        System.out.println("Double to String: " + doubleStringValue);

        // Convert char to String
        char char1 = 'A';
        String charStringValue = Character.toString(char1);
        System.out.println("Char to String: " + charStringValue);

        int[] numbers = {1, 2, 3, 4};
        String string = Arrays.toString(numbers);
        System.out.println("Array to String: " + string);

//        to array
        List<String> stringList = Arrays.asList("hello", "world");
        String[] stringArray = stringList.toArray(new String[0]);
        System.out.println("list to array"+stringArray);

        String strtoar = "apple,banana,orange";
        String[] array = strtoar.split(",");

        String str1 = "hello";
        char[] charArray = str1.toCharArray();
    }

    public static void practice(int num) {
        System.out.println((char) num);
        System.out.println(Integer.toString(num));
        System.out.println((double) num);
        System.out.println((long) num);
        System.out.println((byte) num);
    }
}

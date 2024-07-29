public class ExplicitConversionExample {
    public static void main(String[] args) {
        // Explicit casting from double to int
        double doubleValue = 10.75;
        int intValue = (int) doubleValue;
        System.out.println("Double to Int: " + intValue);

        // Explicit casting from float to int
        float floatValue = 15.5f;
        int intValueFromFloat = (int) floatValue;
        System.out.println("Float to Int: " + intValueFromFloat);

        // Explicit casting from long to int
        long longValue = 123456789L;
        int intValueFromLong = (int) longValue;
        System.out.println("Long to Int: " + intValueFromLong);

        // Explicit casting from int to short
        int intValueToShort = 300;
        short shortValue = (short) intValueToShort;
        System.out.println("Int to Short: " + shortValue);

        // Explicit casting from char to int
        char charValue = 'A';
        int intValueFromChar = (int) charValue;
        System.out.println("Char to Int: " + intValueFromChar);

        // Explicit casting from byte to double
        byte byteValue = 50;
        double doubleValueFromByte = (double) byteValue;
        System.out.println("Byte to Double: " + doubleValueFromByte);

        // Explicit casting from int to char
        int intValueToChar = 65;
        char charValueFromInt = (char) intValueToChar;
        System.out.println("Int to Char: " + charValueFromInt);

        // strings
        // Convert int to String
        int int1 = 42;
        String stringValue = Integer.toString(int1);
        System.out.println("Int to String: " + stringValue);

        // Convert double to String
        double double1 = 3.14;
        String doubleStringValue = Double.toString(double1);
        System.out.println("Double to String: " + doubleStringValue);

        // Convert String to int
        String intString = "123";
        int parsedInt = Integer.parseInt(intString);
        System.out.println("String to Int: " + parsedInt);

        // Convert String to int
        String str = "akshit Mahajan";
        char[] array = str.toCharArray();
        System.out.print("String to Array: ");
        for (char c : array) {
            System.out.print(c);

        }
        System.out.println();
        // Convert String to double
        String doubleString = "45.67";
        double parsedDouble = Double.parseDouble(doubleString);
        System.out.println("String to Double: " + parsedDouble);

        // Concatenate int to String
        int num1 = 10;
        String strNum1 = "20";
        String result1 = num1 + strNum1;
        System.out.println("Concatenate int to String: " + result1);

        // Concatenate double to String
        double num2 = 30.5;
        String strNum2 = "40";
        String result2 = num2 + strNum2;
        System.out.println("Concatenate double to String: " + result2);

        // Convert char to String
        char char1 = 'A';
        String charStringValue = Character.toString(char1);
        System.out.println("Char to String: " + charStringValue);
        int num = 65;
        practice(num);
    }

    public static void practice(int num) {
        System.out.println((char) num);
        System.out.println(Integer.toString(num));
        System.out.println((double) num);
        System.out.println((long) num);
        System.out.println((byte) num);
    }
}

package strings;

public class UniqueCharacters {
    public static void main(String[] args) {
        String input = "taaabbbrrraaat";

        // Iterate through the string
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            boolean isUnique = true;

            // Compare the current character with characters before it
            for (int j = 0; j < i; j++) {
                if (currentChar == input.charAt(j)) {
                    isUnique = false;
                    break;
                }
            }

            // If the character is unique, print it
            if (isUnique) {
                System.out.print(currentChar);
            }

        }
    }
}

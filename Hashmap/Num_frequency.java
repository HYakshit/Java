package hashmap;

import java.util.*;

public class Num_frequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your text (press Ctrl+D or Ctrl+Z to end input):");

        // Read the entire input as a single string
        StringBuilder input = new StringBuilder();
        while (scanner.hasNextLine()) {
            input.append(scanner.nextLine()).append(" "); // Add space to separate words
        }
        scanner.close();

        // Split the input into an array of numbers (as strings)
        String[] numStrings = input.toString().trim().split("\\s+"); // Split by any whitespace

        // Convert the string array to an int array
        int[] num = new int[numStrings.length];
        try {
            for (int i = 0; i < numStrings.length; i++) {
                num[i] = Integer.parseInt(numStrings[i]); // Parse each string to an int
            }
        } catch (NumberFormatException e) {
            System.out.println("Error: Please ensure the input contains only valid integers.");
            return;
        }

        // Create a hashmap to count the frequency of each number
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < num.length; i++) {
            map.put(num[i], map.getOrDefault(num[i], 0) + 1);
        }

        // Create a list from the map's entry set and sort it by value (frequency) in descending order
        List<Map.Entry<Integer, Integer>> sortedEntries = new ArrayList<>(map.entrySet());
        sortedEntries.sort((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()));

        // Print numbers sorted by frequency
        System.out.println("Numbers sorted by frequency:");
        for (Map.Entry<Integer, Integer> entry : sortedEntries) {
            System.out.println(entry.getKey() + " -- " + entry.getValue() + " times");
        }
    }
}

package WordFrequency;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordFrequencyCount {
    public static void main(String[] args) {
        // Step 1: Take user input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a text:");
        String text = scanner.nextLine();
        scanner.close();

        // Step 2: Convert to lowercase and split words
        String[] words = text.toLowerCase().replaceAll("[^a-zA-Z ]", "").split("\\s+");

        // Step 3: Create HashMap
        Map<String, Integer> wordCountMap = new HashMap<>();

        // Step 4: Count words
        for (String word : words) {
            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
        }

        // Step 5: Print word frequencies
        System.out.println("\nWord Frequency:");
        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}

package Strings;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the file path:");
        String filePath = sc.nextLine();
        
        try {
            String content = readFile(filePath);
            
            // Count word frequencies
            Map<String, Integer> wordFrequency = countWordFrequency(content);
            System.out.println("Word Frequency:");
            wordFrequency.forEach((word, count) -> System.out.println(word + ": " + count));
            
            // Convert to uppercase and reverse
            String upperCaseReversed = new StringBuilder(content.toUpperCase()).reverse().toString();
            System.out.println("\nUppercase Reversed Content:\n" + upperCaseReversed);
            
            // Word replacement
            System.out.println("Enter the word to replace:");
            String oldWord = sc.nextLine();
            System.out.println("Enter the replacement word:");
            String newWord = sc.nextLine();
            String modifiedContent = content.replaceAll("\\b" + oldWord + "\\b", newWord);
            
            System.out.println("\nModified Content:\n" + modifiedContent);
            
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
        sc.close();
    }

    private static String readFile(String filePath) throws IOException {
        StringBuilder content = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                content.append(line).append("\n");
            }
        }
        return content.toString();
    }
    
    private static Map<String, Integer> countWordFrequency(String content) {
        Map<String, Integer> wordCount = new HashMap<>();
        String[] words = content.toLowerCase().split("\\W+"); 
        for (String word : words) {
            if (!word.isEmpty()) {
                wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
            }
        }
        return wordCount;
    }
    
    
    public static void testCountWordFrequency() {
        String testContent = "hello world! Hello again, world.";
        Map<String, Integer> result = countWordFrequency(testContent);
        System.out.println("Test Case - Word Frequency:");
        result.forEach((word, count) -> System.out.println(word + ": " + count));
    }
}

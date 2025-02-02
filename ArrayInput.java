import java.util.Arrays;
import java.util.Scanner;

public class ArrayInput {
    public static void main(String[] args) { // Corrected the main method signature
        int[] arr = new int[5]; // Initialize the array with a size of 5
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 5 integers:"); // Prompt the user for input
        for (int i = 0; i < 5; i++) {
            int j = sc.nextInt(); // Read input from the user
            arr[i] = j; // Store the input in the array
        }

        System.out.println("Array elements: " + Arrays.toString(arr)); // Print the array
        sc.close(); // Close the scanner to avoid resource leak
    }
}
package Exercises.Scanners;

import java.util.Scanner;

public class Scanners {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");

        // Read the input string from the user
        String input = scanner.nextLine();

        // Print the string in the upper case
        System.out.println("String in upper case" + input.toUpperCase());

        // Close the scanner
        scanner.close();
    }
}

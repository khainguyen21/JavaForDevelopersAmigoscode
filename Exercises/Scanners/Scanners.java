package Exercises.Scanners;

import java.util.Random;
import java.util.Scanner;

public class Scanners {
    public static void main(String[] args) {

        String[] jokes = {
                "Why don't scientists trust atoms? Because they make up everything!",
                "Why don't some couples go to the gym? Because some relationships don't work out!",
                "What do you call fake spaghetti? An impasta!",
                "Why don't skeletons fight each other? They don't have the guts!",
                "Why did the scarecrow win an award? Because he was outstanding in his field!",
                "Did you hear about the mathematician who's afraid of negative numbers? He'll stop at nothing to avoid them!",
                "Why don't some couples go to the gym? Because some relationships don't work out!",
                "Why was the math book sad? It had too many problems.",
                "Why did the bicycle fall over? Because it was two-tired!",
                "Why don't some fish play piano? You can't tuna fish!"
        };
        // Create a Scanner object
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");

        // Read the input string from the user
        String input = scanner.nextLine();

        // Print the string in the upper case
        System.out.println("String in upper case" + input.toUpperCase());

        if (args.length == 0) {
            System.out.println("Please provide numbers as program arguments");
        }

        for (String arg : args) {
            try {
                if (Integer.parseInt(arg) % 2 == 0) {
                    System.out.println("The number is even");
                } else {
                    System.out.println("The number is odd");
                }
            } catch (NumberFormatException e) {
                System.out.println(arg + " is not a valid integer ");
            }
        }
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();

        System.out.println(checkPrime(number));

        // Use the code below to generate random numbers. In this case from 0 to 9
        boolean replay;
        do {
            System.out.print("Want to hear a joke? (Yes/No): ");
            Scanner scanner1 = new Scanner(System.in);
            String result = scanner1.nextLine().strip().toLowerCase();
            if (result.equalsIgnoreCase("yes")) {
                Random random = new Random();
                int randomNumber = random.nextInt(9);
                System.out.println(jokes[randomNumber]);
                replay = true;
            } else {
                System.out.println("Alright, Good Bye!");
                scanner.close();
                scanner1.close();
                replay = false;
            }
        } while (replay);

        // You need to change random.nextInt(9); accordingly to match your jokes array length
    }

    /*
        Write a program that takes an input number from the console and prints if the number is prime
        Create a method to check if the number is prime then use against the input
    */
    public static boolean checkPrime(int num) {
        return false;
    }

    /*
    Write a method that displays a random joke to the user.
    Your program should stop displaying jokes when use inputs no.
    For e.g
    Want to hear a joke? Yes/No
        if yes then display joke and repeat same question.
        if no then program should exit
    */

}

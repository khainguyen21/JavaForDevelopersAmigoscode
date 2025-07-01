package Exercises.Conditionals;

public class Conditionals {
    public static void main(String[] args) {
        // QUESTION 1
        // creates an integer variable,
        // creates a second integer variable,
        // creates an `if` statement which compares the two variables and prints to the console if they are equal
        int num1 = 10;
        int num2 = 20;

        if (num1 == num2) {
            System.out.println("Two numbers are both equal!");
        }


        // QUESTION 2
        // create a string variable
        // create a second string variable which has the same value as the first
        // create an `if` statement which compares the two variables and prints to the console if they are equal
        String firstVariable = "Haha";
        String secondVariable = "Haha";

        if (firstVariable.equalsIgnoreCase(secondVariable)) {
            System.out.println("Two strings are both equal! ");
        }

        // QUESTION 3
        // create an string variable using the `new` keyword
        // create a second string variable which has the same value as the first, again using the `new` keyword
        // create an `if` statement which compares the two variables and prints to the console if they are equal
        String firstString = new String("Hihi");
        String secondString = new String("Hihi");

        if (firstString == secondString) {
            System.out.println("Two strings are both equal! ");
        }

        // QUESTION 4
        // create two `int` variables. Assign them values
        // create an `if` statement which compares whether one value is greater than the other
        if (num1 > num2) {
            // print something to the console if the condition is met
            System.out.println("Number " + num1 + " are greater than " + num2);
        } else {
            // create an `else` statement which prints to the console if the above condition is NOT met
            System.out.println("Number " + num1 + " are smaller than or equal " + num2);
        }

        // QUESTION 5 && QUESTION 6
        // Create three `int` variables. Assign them values with the first value sitting between the other two
        int num3 = 30;
        // create an `if` statement which compares whether the first value is greater than the second AND less than the third
        if (num1 > num2 || num1 < num2) {
            // print something to the console if the condition is met
            System.out.println(num3 + " is greater than " + num2 + " or " + "less than number " + num1);
        }

        // create an `else` statement which prints to the console if the above condition is NOT met
        else {
            System.out.println("The first variable does not meet the specified condition.");
        }

        // create a String variable and assign it a value
        String myString = "Hello, World!";
        // create an `if` statement which grabs the first letter of your word and compares it against a Character value
        char specifiedCharacter = 'H';
        // print something to the console if the condition is met
        if (specifiedCharacter == myString.charAt(0)) {
            System.out.println("Condition are met");
        }

        // Create a String variable
        String word = "Hello, World!";

        // Specify the character to check for (convert to lowercase for case-insensitive check)
        char specifiedCharacter1 = 'o'; // You can change this character to test different cases

        word = word.toLowerCase();

        specifiedCharacter1 = Character.toLowerCase(specifiedCharacter1);

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == specifiedCharacter1) {
                System.out.println("The character is matched at index " + i);
            }
        }

        // create a for loop which goes from 0 to 20
        // print each even value

        for (int i = 0; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}

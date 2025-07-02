package Exercises.ArraysConditionalsAndMethods;


import java.util.Arrays;

public class ArraysConditionalsAndMethods {
    public static void main(String[] args) {
        System.out.println(reverseStr("hello"));
        System.out.println(transform("   amig os cod e  "));
        System.out.println(longStrInArray(new String[]{""}));
        System.out.println(longStrInArray(new String[]{"bye", "ola", "hello", "ciao"}));
        System.out.println(longStrInArray(new String[]{"hello", "hello", "ola", "bye", "ciao"}));
        System.out.println(longStrInArray(new String[]{"hello", "bingo", "ola", "bye", "ciao"}));
    }

    /*
        Write a method that reverses any String and print to console
        Input should be a string
        Output should be reversed input
    */
    public static String reverseStr(String input) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = input.length() - 1; i >= 0; i--) {
            stringBuilder.append(input.charAt(i));
        }

        return stringBuilder.toString();
    }

    /*
        Given the following String input
        String input = "   amig os cod e  "
        Write a method that transforms input into: Amigoscode
    */

    public static String transform(String input) {
        String[] strippedStr = input.strip().split(" ");

        StringBuilder result = new StringBuilder();

        for (String string : strippedStr) {
            result.append(string);
        }

        return result.replace(0, 1, result.substring(0,1).toUpperCase()).toString();
    }

    public static String longStrInArray(String[] stringArr) {
        StringBuilder longestStr = new StringBuilder();
        int maxLength = 0;
        for (String string : stringArr) {
            if (string.length() > maxLength) {
                longestStr = new StringBuilder(string);
                maxLength = string.length();
            } else if (string.length() == maxLength && !string.equalsIgnoreCase(longestStr.toString()))
                longestStr.append(", ").append(string);
            }

        return longestStr.toString();
    }
}

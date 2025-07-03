package Exercises.Methods;

import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;
        int result = sum(num1, num2);
        System.out.println(result);
        System.out.println(negated(5));
        System.out.println(negated(-10));
        System.out.println(same(1, 2));
        compareNumbers(num1, num2);

        String inputString = "hello world";
        String capitalizedString = capitalizeFirstLetter(inputString);
        System.out.println(capitalizedString);

        String[] names = {"Alice", "Bob", "Charlie", "David"};
        int size = getArraySize(names);
        System.out.println("Number of items in the array: " + size);

        String sentence = "Hello, this is a sample sentence.";

        int wordCount = countWordsInSentence(sentence);
        System.out.println("The sentence contains " + wordCount + " words.");

    }

    public static int sum(int firstNum, int secondNum) {
        return (firstNum + secondNum);
    }

    public static int negated(int num) {
        return -num;
    }

    public static boolean same(int num1, int num2) {
        return num1 == num2;
    }

    public static void compareNumbers(int firstNum, int secondNum) {
        if (firstNum > secondNum) {
            System.out.println("The first number is larger");
        } else if (firstNum < secondNum) {
            System.out.println("The second number is larger");
        } else {
            System.out.println("The numbers are equal");
        }
    }

    public static String capitalizeFirstLetter(String string) {
        String[] splitStr = string.split(" ");
//        StringBuilder stringBuilder = new StringBuilder(string);
        for (int i = 0; i < splitStr.length; i++) {
            splitStr[i] = splitStr[i].substring(0, 1).toUpperCase() + splitStr[i].substring(1);
        }
        return String.join(" ", splitStr);
    }


    public static int getArraySize(String[] arr) {
        return arr.length;
    }


    public static int countWordsInSentence(String sentence) {

        if (sentence == null || sentence.isEmpty()) {
            return 0;
        }

        String[] arrayStr = sentence.split(" ");
        System.out.println(Arrays.toString(arrayStr));

        return arrayStr.length;
    }
}

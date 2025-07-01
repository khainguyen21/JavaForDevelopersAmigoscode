package Exercises.Loops_and_Arrays;

import java.util.Arrays;

public class LoopsAndArray {
    public static void main(String[] args) {
        // declare an empty integer array of length = 3
        int[] array = new int[3];

        // print contents to the console
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element at index" + i + ": " + array[i]);
        }

        System.out.println(Arrays.toString(array));


        // fill it with the number '4'
        for (int i = 0; i < array.length; i++) {
            array[i] = 4;
        }

        // print the array to the console
        System.out.println(Arrays.toString(array));

        // reassign the second value in the array to the number `17`
        array[1] = 17;

        // print the array to the console
        System.out.println(Arrays.toString(array));

        // declare and initialize a String array which holds the values "a", "b", "c" and "d"
        String[] stringArray = {"a", "b", "c", "d"};

        // Print the contents of the array to the console
        System.out.println(Arrays.toString(stringArray));

        // using your answer from Q5 above, create a second array which is initialized using your original array
        // hint: instead of using the `new` keyword, try simply giving the name of your original array
        // change the value at index 0 of the new array to "z"
        // print both of your arrays and compare
        String[] newArray = stringArray;

//        arrayDup[0] = "z";
//        System.out.println(Arrays.toString(arrayStr));
//        System.out.println(Arrays.toString(arrayDup));

        String[] copiedArray = Arrays.copyOf(stringArray, stringArray.length);
        copiedArray[0] = "z";

        System.out.println(Arrays.toString(stringArray));
        System.out.println(Arrays.toString(copiedArray));

        String[] a = {"a", "b", "c", "d"};
        // create a `for` loop which prints each item in the array
        for (String s : a) {
            System.out.print(s + " ");
        }

        System.out.println();

        // create a for loop which goes from 0 to 10
        // print each value
        for (int i = 0; i <= 10; i++) {
            System.out.print(i + " ");
        }

        System.out.println();

        // create a for loop which goes from 10 down to 0
        // print each value
        for (int i = 10; i >= 0; i--) {
            System.out.print(i + " ");
        }

        System.out.println();

        // Create an array. Remember to manually set the size
        // create a for loop which goes from 0 to 10, adding each value to an array
        // print our array
        int[] numArr = new int[11];

        for (int i = 0; i <= 10 ; i++) {
            numArr[i] = i;
        }
        System.out.println(Arrays.toString(numArr));

        // create an array of n numbers
        int[] nNumberArr = {10, 5, 7, 3, 8};

        // create a sum variable
        int totalNumArr = 0;

        // create a loop
        for (int number : nNumberArr) {
            totalNumArr += number;
        }

        // outside the loop print the total sum
        System.out.println("Total of all element in number array: " + totalNumArr);

        String[] words = {"i", "sure", "do", "love", "bees"};

        // create a for loop which goes through each string in our array
        for (int i = 0; i < words.length; i++) {
            // make each word uppercase
            // assign the value in the array to the uppercase string
            words[i] = words[i].toUpperCase();
        }

        // print our resulting array
        System.out.println(Arrays.toString(words));

        String[] words1 = {"i", "sure", "do", "love", "bees"};

        // create a for loop which goes through each string in our array
        for (int i = 0; i < words1.length; i++) {

            String firstChar = words1[i].substring(0,1).toUpperCase();
            words1[i] = firstChar + words1[i].substring(1);
        }

        System.out.println(Arrays.toString(words1));

    /*
        Write a program that reverses an array of Strings
        String[] content = {"you", "are", "how", "hello"}
        Tip. Use for loop and you to start at highest index.
        Output should be: hello how are you?. Note question mark at the end
    */

        String[] content = {"you", "are", "how", "hello"};

        for (int i = content.length - 1; i >= 0; i--) {
            System.out.print(content[i]);

            if (i != 0) {
                System.out.print(" ");
            }
        }
        System.out.print("?");

        System.out.println();
       /*
        Write a program that adds total amount for this string "0.90, 1.00, 9.00, 8.78, 0.01".

        Tip:
        - String input = "0.90, 1.00, 9.00, 8.78, 0.01";
        - create variable to store result. double result = 0;
        - convert string to array by using the String[] numbers = input.split(", ")
        - then loop.
        - convert each string to decimal and add to current result
            - use Double.parseDouble(string) to convert a string to double
        */

        String number = "0.90, 1.00, 9.00, 8.78, 0.01";
        String[] numbers = number.split(",");
        System.out.println(Arrays.toString(numbers));

        double total = 0;
        for (String num : numbers) {
            total += Double.parseDouble(num);
        }

        System.out.println("Total: " + total);

        System.out.println(Arrays.toString(args));
        for (String str : args) {
            System.out.println(str);
        }
        for (int i = 0; i < args.length; i++) {
            System.out.println("Argument " + (i + 1) + ": " + args[i]);
        }
    }
}

package com.khaidevcode;

public class AccessExample {
    private String instanceVariable = "I am an instance variable.";
    private static String staticVariable = "I am a static variable.";

    public static void myStaticMethod() {
        System.out.println(); // This would cause a compile-time error.
        System.out.println(staticVariable); // This is fine.
    }

    public void myInstanceMethod() {
        System.out.println(instanceVariable); // This is fine.
        System.out.println(staticVariable);
    }
}
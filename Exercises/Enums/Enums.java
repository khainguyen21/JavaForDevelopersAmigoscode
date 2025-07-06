package Exercises.Enums;

public class Enums {

    public static void main(String[] args) {

        System.out.println("Selected t-shirt size: " + TShirtSize.S);

        TShirtSize[] sizes = TShirtSize.values();

        for (TShirtSize size : sizes) {
            String lowerCaseSize = size.name();
            System.out.println(lowerCaseSize.toLowerCase());
        }
    }
}

package Exercises.ExceptionHandling;

public class ExceptionHandling {
    public static void main(String[] args) {
        int sum = 0;

        StringBuilder notInt = new StringBuilder();

        for (String arg : args) {
            try {
                int num = Integer.parseInt(arg);
                sum += num;
            } catch (NumberFormatException e) {
                if (!notInt.isEmpty()) {
                    notInt.append(",");
                }
                notInt.append(arg);
            }
        }

        System.out.println(sum);

        try {
            int result = 10 / 0;

        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by 0");
        }



    }
}

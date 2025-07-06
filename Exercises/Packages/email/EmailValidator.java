package Exercises.Packages.email;

public class EmailValidator {
    static boolean checkEmail (String email) {
        if (email.isEmpty() || email == null || !email.contains("@")) {
            return false;
        }

        return true;
    }
}

package Exercises.Packages.email;

public class TestEmailValidator {
    public static void main(String[] args) {
        boolean checkEmail = EmailValidator.checkEmail("haha");
        System.out.println(checkEmail);
        EmailValidator validator = new EmailValidator();
        String email1 = "user@example.com";
        String email2 = "invalid_email";

        boolean isValid1 = validator.checkEmail(email1);
        boolean isValid2 = validator.checkEmail(email2);

        System.out.println("Email 1 is valid: " + isValid1);
        System.out.println("Email 2 is valid: " + isValid2);
    }

}

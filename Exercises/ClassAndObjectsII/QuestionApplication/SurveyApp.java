package Exercises.ClassAndObjectsII.QuestionApplication;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class SurveyApp {

    public static void main(String[] args) {
        // Create a questionnaire with id 1
        Questionnaire questionnaire = new Questionnaire(1);

        // Add some sample questions
        questionnaire.addQuestion(new Question("What is your favorite color?"));
        questionnaire.addQuestion(new Question("How often do you exercise?"));

        // Get user details
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your email: ");
        String email = scanner.nextLine();

        boolean validDOB = false;

        LocalDate dateOfBirthFormatted = null;
        while (!validDOB) {
            System.out.println("Enter your date of birth (YYYY-MM-DD): ");
            String dobStr = scanner.nextLine();

            try {
                dateOfBirthFormatted = LocalDate.parse(dobStr);
                validDOB = true;
            } catch (Exception e) {
                System.out.println("Invalid date format. Please use YYYY-MM-DD");
            }

        }

        Person person = new Person(name, email, dateOfBirthFormatted);


        String[] answers = new String[questionnaire.getQuestionList().size()];

        for (int i = 0; i < answers.length; i++) {
            System.out.println(questionnaire.getQuestionList().get(i).getQuestionText() + " ");
            answers[i] = scanner.nextLine();
        }

        saveAnswersToFile(person, answers);
        scanner.close();
    }

    private static void saveAnswersToFile(Person person, String[] answers) {
        try {

            String filePath = "src/survey_answers.txt";
            BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true));

            writer.write(" Name: " + person.getName());
            writer.write(" Email: " + person.getEmail());
            writer.write(" Date of Birth: " + person.getDob());
            writer.write("\n");
            int counter = 1;
            for (int i = 0; i < answers.length; i++) {
                writer.write(" Question " + counter + ": " + answers[i]);
                counter++;
            }

            writer.write("\n");
            writer.write("\n");

            writer.close();

            System.out.println("Content successfully written to " + "survey_answers.csv");
        } catch (IOException e) {
            System.out.println("Here is the message" + e.getMessage());
        }

    }
}

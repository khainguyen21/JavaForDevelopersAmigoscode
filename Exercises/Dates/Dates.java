package Exercises.Dates;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Dates {
    public static void main(String[] args) {

        // Get the current date
        LocalDate currentToday = LocalDate.now();

        // Get the current date and time
        LocalDateTime currentDateTime = LocalDateTime.now();

        // Define a custom date and time format using DateTimeFormatter
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        // Print today's date
        System.out.println("Today's Date: " + currentToday.format(dateTimeFormatter));

        // Print today's date and time
        System.out.println("Current date and time: " + currentDateTime.format(dateTimeFormatter1));

        // Define the date of birth as integers
        int year = 1990;
        int month = 5;
        int day = 15;

        LocalDate dateOfBirth = LocalDate.of(year, month, day);
        DateTimeFormatter dateTimeFormatter2 = DateTimeFormatter.ofPattern("MM-dd-yyyy");

        System.out.println(dateOfBirth.format(dateTimeFormatter2));

        LocalDate oneHunderedDayAfter = dateOfBirth.plusDays(100);
        System.out.println(oneHunderedDayAfter.format(dateTimeFormatter2));

        // Example usage:
        LocalDate birthDate = LocalDate.of(1990, 5, 15);
        LocalDate currentDate = LocalDate.now();
        int age = calculateAge(birthDate, currentDate);
        System.out.println("Age: " + age);
    }

    private static int calculateAge(LocalDate birthDate, LocalDate currentDate) {
        // hint: subtract todays date[year] - date[year]
        // Calculate the period between the birth date and current date
        Period period = Period.between(birthDate, currentDate);

        // Get the years from the period
        int years = period.getYears();

        // Get the months from the period
        int months = period.getMonths();

        // Get the days from the period
        int days = period.getDays();

        // Adjust the age based on the months and days
        if (months < 0 || (months == 0 && days < 0)) {
            years--;
        }

        return years;
    }
}

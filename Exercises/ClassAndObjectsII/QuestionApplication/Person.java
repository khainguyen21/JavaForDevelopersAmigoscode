package Exercises.ClassAndObjectsII.QuestionApplication;

import java.time.LocalDate;
import java.util.Date;

public class Person {
    private String name;
    private String email;
    private LocalDate dob;


    public Person(String name, String email, LocalDate dob) {
        this.name = name;
        this.email = email;
        this.dob = dob;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public LocalDate getDob() {
        return dob;
    }
}

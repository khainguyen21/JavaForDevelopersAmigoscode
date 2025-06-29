package com.khaidevcode;

import java.util.Arrays;
import java.util.Objects;

public class Person {

    public static int count;
    static {
        System.out.println("start: static initialization");
        count = 0;
        System.out.println("end: static initialization");
    }

    private String firstName;
    private String lastName;
    private Gender gender;
    private Cat[] cat;

    public Person() {
        System.out.println("Default Constructor");
    }
    public Person(String firstName, String lastName, Gender gender, Cat[] cat) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.cat = cat;
        count++;
    }

    public Person(String firstName, String lastName, Gender gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        count++;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Cat[] getCat() {
        return cat;
    }

    public void setCat(Cat[] cat) {
        this.cat = cat;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender=" + gender +
                ", cat=" + Arrays.toString(cat) +
                '}';
    }

    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;
        Person person = (Person) object;
        return Objects.equals(firstName, person.firstName) && Objects.equals(lastName, person.lastName) && gender == person.gender && Objects.deepEquals(cat, person.cat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, gender, Arrays.hashCode(cat));
    }

}

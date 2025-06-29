package exercise;

import java.util.Arrays;
import java.util.Objects;

public class Person {
    private String name;
    private int age;
    private Address address;
    private Car[] car;

    public Person(String name, int age, Address address, Car[] car) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.car = car;
    }

    public Person(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Car[] getCar() {
        return car;
    }

    public void setCar(Car[] car) {
        this.car = car;
    }

    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;
        Person person = (Person) object;
        return age == person.age && Objects.equals(name, person.name) && Objects.equals(address, person.address) && Objects.deepEquals(car, person.car);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, address, Arrays.hashCode(car));
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address=" + address +
                ", car=" + Arrays.toString(car) +
                '}';
    }
}

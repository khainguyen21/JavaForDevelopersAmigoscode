package exercise;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Address alexAddress = new Address("2855 Senter Rd", "95111", "United States");

        Car telsa = new Car(
                CarBrand.Telsa,
                BigDecimal.valueOf(65000),
                        2025
                );

        Car[] AlexCar = {telsa};
        Person Alex = new Person("Alex", 18, alexAddress, AlexCar);

        System.out.println(Alex);
    }
}

package Exercises.ClassesAndObjects;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car("Tesla", BigDecimal.valueOf(37000), EngineType.ELECTRIC);
        System.out.println(myCar);

        // Using getters to access car properties
        String manufacturer = myCar.getManufacturer();
        BigDecimal price = myCar.getPrice();
        EngineType engineType = myCar.getEngineType();

        // Printing car details using the getters
        System.out.println("My car details:");
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Price: " + price);
        System.out.println("Engine Type: " + engineType);

        System.out.println();

        // Using setters to modify car properties
        myCar.setManufacturer("Honda");
        myCar.setPrice(BigDecimal.valueOf(28000.0));
        myCar.setEngineType(EngineType.ELECTRIC);

        // Printing modified car details using the getters
        System.out.println("My car details after modification:");
        System.out.println("Manufacturer: " + myCar.getManufacturer());
        System.out.println("Price: " + myCar.getPrice());
        System.out.println("Engine Type: " + myCar.getEngineType());



        // Creating a car dealership with a maximum of 5 cars on display
        CarDealership dealership = new CarDealership("XYZ Auto", 5);

        // Adding cars to the dealership's stock
        Car toyota = new Car("Toyota", BigDecimal.valueOf(25000.0), EngineType.PETROL);
        dealership.addCarToStock(toyota);

        Car tesla = new Car("Tesla", BigDecimal.valueOf(75000.0), EngineType.ELECTRIC);
        dealership.addCarToStock(tesla);

        Car honda = new Car("Honda", BigDecimal.valueOf(28000.0), EngineType.HYBRID);
        dealership.addCarToStock(honda);

        Car ford = new Car("Ford", BigDecimal.valueOf(32000.0), EngineType.DIESEL);
        dealership.addCarToStock(ford);

        Car nissan = new Car("Nissan", BigDecimal.valueOf(22000.0), EngineType.PETROL);
        dealership.addCarToStock(nissan);

        Car chevrolet = new Car("Chevrolet", BigDecimal.valueOf(30000.0), EngineType.HYBRID);
        dealership.addCarToStock(chevrolet);

        // Display all cars in the dealership
        System.out.println("\nCars currently in stock at " + dealership.getName() + ": ");
        ArrayList<Car> carsInStock = dealership.getAllCarsInStock();
        // Iterate through the Array list of all cars in the dealer
        for (Car car : carsInStock) {
            if (car != null) {
                System.out.println(car);
            }
        }

        // Display the total of cars in the dealership
        System.out.println(dealership.totalCarsInDealership());

        // Remove Toyota
        dealership.removeCarFromStock(toyota);
        System.out.println(dealership.totalCarsInDealership());

        // Remove Nissan
        dealership.removeCarFromStock(nissan);

        // Find Nissan car
        System.out.println(dealership.findCarByManufacturer("Nissan"));

    }
}

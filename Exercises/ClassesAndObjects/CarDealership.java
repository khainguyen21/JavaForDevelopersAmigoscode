package Exercises.ClassesAndObjects;

import java.util.ArrayList;
import java.util.List;

public class CarDealership {
    private String name;
    private int maxCarsOnDisplay;
    private ArrayList<Car> allCarsInStock; // Using an array to represent cars in stock
    private int totalCurrentCars;

    // Constructor

    public CarDealership(String name, int maxCarsOnDisplay) {
        this.name = name;
        this.maxCarsOnDisplay = maxCarsOnDisplay;
        this.allCarsInStock = new ArrayList<Car>();
    }

    public CarDealership(String name, int maxCarsOnDisplay, ArrayList<Car> allCarsInStock) {
        this.name = name;
        this.maxCarsOnDisplay = maxCarsOnDisplay;
        this.allCarsInStock = allCarsInStock;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxCarsOnDisplay() {
        return maxCarsOnDisplay;
    }

    public void setMaxCarsOnDisplay(int maxCarsOnDisplay) {
        this.maxCarsOnDisplay = maxCarsOnDisplay;
    }

    public List<Car> getAllCarsInStock() {
        return allCarsInStock;
    }

    public void addCarToStock(Car car) {
        allCarsInStock.add(car);
    }

    public void removeCarFromStock(String manufacture) {
        allCarsInStock.removeIf(car -> car != null && car.getManufacturer().equalsIgnoreCase(manufacture)
        );
    }

    public int totalCarsInDealership () {
        totalCurrentCars = 0;
        for (Car car : allCarsInStock) {
            if (car != null) {
                totalCurrentCars++;
            }
        }

        return totalCurrentCars;
    }

    public Car findCarByManufacturer(String manufacturer) {
        for (Car car : allCarsInStock) {
            if (car.getManufacturer().equalsIgnoreCase(manufacturer)) {
                return car;
            }
        }

        return null;
    }
    @Override
    public String toString() {
        return "CarDealership{" +
                "name='" + name + '\'' +
                ", maxCarsOnDisplay=" + maxCarsOnDisplay +
                ", allCarsInStock=" + allCarsInStock +
                '}';
    }
}

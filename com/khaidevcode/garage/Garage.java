package com.khaidevcode.garage;

import com.khaidevcode.car.Car;

import java.util.Arrays;
import java.util.Objects;

public class Garage {
    private int number;
    private int capacity;
    private Car[] cars;

    public Garage(int number, int capacity) {
        this.number = number;
        this.capacity = capacity;
        this.cars = new Car[capacity];
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public Car[] getCars() {
        return cars;
    }

    public void setCars(Car[] cars) {
        this.cars = cars;
    }

    @Override
    public String toString() {
        return "Garage{" +
                "number=" + number +
                ", capacity=" + capacity +
                ", cars=" + Arrays.toString(cars) +
                '}';
    }

    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;
        Garage garage = (Garage) object;
        return number == garage.number && capacity == garage.capacity && Objects.deepEquals(cars, garage.cars);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, capacity, Arrays.hashCode(cars));
    }
}

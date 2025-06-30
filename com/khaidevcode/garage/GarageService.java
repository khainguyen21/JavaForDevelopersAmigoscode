package com.khaidevcode.garage;

import com.khaidevcode.car.Car;

public class GarageService {
    public boolean addCarToGarage(Car car, Garage garage) {

        if (car == null) {
            throw new IllegalArgumentException("Car cannot be null");
        }

        int count = 0;
        for (Car garageCar : garage.getCars()) {
            if (garageCar != null) {
                count++;
            }
        }
        if (garage.getCapacity() < count) {
            // add car to garage
            return true;
        }
        return false;
    }
}

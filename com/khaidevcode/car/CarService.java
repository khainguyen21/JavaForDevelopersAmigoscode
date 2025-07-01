package com.khaidevcode.car;

public class CarService {

    private CarDAO carDAO;

    public CarService(CarDAO carDAO) {
        this.carDAO = carDAO;
    }

    public int registerNewCar(Car car) {
        // check if a car is not null
        // check if reg number is valid
        // check if reg number not taken
        // check if price is < 0, cannot be a price
        carDAO.saveCar(car);
        return 1;
    }

    public Car[] getCars() {
        return carDAO.selectAllCars();
    }

    @Override
    public String toString() {
        return "CarService{" +
                "carDAO=" + carDAO +
                '}';
    }
}

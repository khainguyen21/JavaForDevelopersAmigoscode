package Exercises.ClassAndObjectsII;

public class Garage {

    private Car[] cars;
    private int numCars;

    public Garage(int capacity) {
        cars = new Car[numCars];
        numCars = 0;
    }

    public void addCar (Car car) {
        if (numCars < cars.length) {
            cars[numCars] = car;
            numCars++;
        } else {
            System.out.println("Garage is full. Cannot add more cars");
        }
    }

    public void removeCar(Car car) {
        for (int i = 0; i < cars.length; i++) {
            if (car == cars[i]) {
                for (int j = i; j < numCars - 1; j++) {
                    cars[j] = cars[j++];
                }
            }
            cars[numCars] = null;
            numCars--;
            break;
        }
    }

    public Car[] getAllCars() {
        Car[] allCars = new Car[numCars];
        System.arraycopy(cars, 0, allCars, 0, numCars);
        return allCars;
    }
}

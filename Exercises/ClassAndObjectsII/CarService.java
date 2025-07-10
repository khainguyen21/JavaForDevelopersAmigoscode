package Exercises.ClassAndObjectsII;

public class CarService {
    public void repairCar(Car car) {
        // Code to perform car repair
        System.out.println("Car repaired: " + car.getMake() + " " + car.getModel());
    }

    public void washCar(Car car) {
        // Code to wash the car
        System.out.println("Car washed: " + car.getMake() + " " + car.getModel());
    }

    public void refuelCar(Car car) {
        // Code to refuel the car
        System.out.println("Car refueled: " + car.getMake() + " " + car.getModel());
    }
}

package Exercises.ClassAndObjectsII;


public class Main {
    public static void main(String[] args) {
        Person Alex = new Person("Alex", "Pham", Gender.MALE, "hello@gmail.com");

        Person Mia = new Person("Mia", "Le", Gender.FEMALE, "bye@gmail.com");

        Garage garage = new Garage(2);

        Car car1 = new Car("Toyota", "Corolla", 2021, "ABC123");
        Car car2 = new Car("Honda", "Civic", 2022, "XYZ789");

        garage.addCar(car1);
        garage.addCar(car2);

        Car[] allCars = garage.getAllCars();
        for (Car car : allCars) {
            System.out.println("Car: " + car.getMake() + " " + car.getModel() + " (" + car.getYear() + ")");
        }

        CarService carService = new CarService();
        carService.repairCar(car1);
        carService.washCar(car2);



    }
}

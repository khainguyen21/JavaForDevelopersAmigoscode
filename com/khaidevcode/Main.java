package com.khaidevcode;

import com.khaidevcode.car.Car;
import com.khaidevcode.car.CarDAO;
import com.khaidevcode.car.CarService;

import java.math.BigDecimal;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

//        Cat rose = new Cat("Rose", 2, "purple");
//        Cat rose2 = new Cat("Rose", 2, "purple");
//        System.out.println(rose);
//        System.out.println(rose2);
//        System.out.println(rose == rose2);
//        System.out.println(rose.equals(rose2));

//        Cat star = new Cat("Star");
//        System.out.println(star);
//
//        Cat jupiter = new Cat("Jupiter");
//        System.out.println(jupiter);
//
//        String[] names = {"Foo", "Bar"};
//        System.out.println(Arrays.toString(names));
//        Cat[] cats = {rose, rose2};
//        Person Alex = new Person("Alex", "Montana", Gender.MALE, cats);
//        Person Alex1 = new Person("Alex", "Montana", Gender.MALE, cats);
//
//        System.out.println(Person.count);
//
//
//        System.out.println(Alex);
//        System.out.println(Alex1);
//        new Person();
//        new Person();
//        System.out.println(Person.count);
//        System.out.println(max(10, 20));
//
//        AccessExample.myStaticMethod();
//
//        System.out.println();
        Car car = new Car("1234", BigDecimal.valueOf(10));
        CarDAO carDAO = new CarDAO();
        CarService carService = new CarService(carDAO);

        carService.registerNewCar(car);
        System.out.println(Arrays.toString(carService.getCars()));
    }
}

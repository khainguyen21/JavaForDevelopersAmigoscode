package exercise;

import java.math.BigDecimal;
import java.util.Objects;

public class Car {
    private CarBrand brand;
    private BigDecimal price;
    private int year;

    public Car(CarBrand brand, BigDecimal price, int year) {
        this.brand = brand;
        this.price = price;
        this.year = year;
    }

    public CarBrand getBrand() {
        return brand;
    }

    public void setBrand(CarBrand brand) {
        this.brand = brand;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;
        Car car = (Car) object;
        return year == car.year && Objects.equals(brand, car.brand) && Objects.equals(price, car.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, price, year);
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand=" + brand +
                ", price=" + price +
                ", year=" + year +
                '}';
    }
}

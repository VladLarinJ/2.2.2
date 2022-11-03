package web.dao;

import web.model.Car;

import java.util.Arrays;
import java.util.List;

public class ListOfCars {
    public static List<Car> getListOfCars() {
        Car car1 = new Car("suzuki", 1,"blue");
        Car car2 = new Car("honda", 2,"white");
        Car car3 = new Car("bmw", 3,"black");
        Car car4 = new Car("renault", 4,"brown");
        Car car5 = new Car("lada", 5,"gray");

        return Arrays.asList(car1, car2, car3, car4, car5);
    }
}

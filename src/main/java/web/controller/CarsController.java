package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarServiceImp;

import java.util.Arrays;
import java.util.List;

@Controller
public class CarsController {

    private final CarServiceImp carServiceImp;
    private final List<Car> listOfCars;

    {
        Car car1 = new Car("suzuki", 1,"blue");
        Car car2 = new Car("honda", 2,"white");
        Car car3 = new Car("bmw", 3,"black");
        Car car4 = new Car("renault", 4,"brown");
        Car car5 = new Car("lada", 5,"gray");

        listOfCars = Arrays.asList(car1, car2, car3, car4, car5);
    }

    public CarsController(CarServiceImp carServiceImp, List<Car> listOfCars) {
        this.carServiceImp = carServiceImp;

    }

    @GetMapping(value = "/cars")
    public String getListOfCars(@RequestParam(value = "count", required = false) int count, Model model) {
        model.addAttribute("all_cars", carServiceImp.getListOfCarsByCount(listOfCars, count));
        return "/cars";
    }

}


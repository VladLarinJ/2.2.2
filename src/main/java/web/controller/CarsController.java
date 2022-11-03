package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.dao.ListOfCars;
import web.model.Car;
import web.service.CarServiceImp;
import web.service.incorrectParamException;

import java.util.Arrays;
import java.util.List;

@Controller
public class CarsController {

    private final CarServiceImp carServiceImp;

    public CarsController(CarServiceImp carServiceImp) {
        this.carServiceImp = carServiceImp;

    }

    @GetMapping(value = "/cars")
    public String getListOfCars(@RequestParam(value = "count", defaultValue = "5") int count, Model model) {
        try {
            model.addAttribute("all_cars", carServiceImp.getListOfCarsByCount(ListOfCars.getListOfCars(), count));
        } catch (incorrectParamException e) {
            model.addAttribute("error", e.getError());
        }
        return "/cars";
    }
}


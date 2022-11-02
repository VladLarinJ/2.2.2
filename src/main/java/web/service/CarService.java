package web.service;

import web.model.Car;

import java.util.List;

public interface CarService {
    List<Car> getListOfCarsByCount(List<Car> listOfCars, int count) throws incorrectParamException;
}

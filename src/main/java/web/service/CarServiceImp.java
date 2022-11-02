package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.List;

@Component
public class CarServiceImp implements CarService{

    @Override
    public List<Car> getListOfCarsByCount(List<Car> listOfCars, int count) throws incorrectParamException {
        if (count >= 5) {
            return listOfCars;
        } else if (count < 0){
                throw new incorrectParamException();
        } else {
            return listOfCars.stream().limit(count).toList();
        }
    }
}

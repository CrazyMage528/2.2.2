package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarService {

    private final List<Car> cars = Arrays.asList(
            new Car("Model S", "Tesla", 2020),
            new Car("Mustang", "Ford", 1968),
            new Car("Civic", "Honda", 2019),
            new Car("Corolla", "Toyota", 2018),
            new Car("911", "Porsche", 2021)
    );

    public List<Car> getCars(Integer count) {
        if (count == null || count >= cars.size()) {
            return cars;
        }
        return cars.stream().limit(count).collect(Collectors.toList());
    }
}

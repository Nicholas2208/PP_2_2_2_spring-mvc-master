package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;


public interface CarsDao {
    List<Car> getAllCars();
    List<Car> getCarsLimit(int limit);
}

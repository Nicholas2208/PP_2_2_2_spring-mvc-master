package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;


public interface CarsDao {
    List<Car> getCars();
    List<Car> getCars(int limit);
}

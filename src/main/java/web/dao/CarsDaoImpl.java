package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarsDaoImpl implements CarsDao {
    private List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car("1HUDC4015VA000345", "Lada", "Red"));
        cars.add(new Car("1GRDC3565VA000765", "Fiat", "Blue"));
        cars.add(new Car("1ABCD8765AD456001", "BMW", "Black"));
        cars.add(new Car("2FGTR7689VA000321", "Mazda", "White"));
        cars.add(new Car("3JKTR7689UT000897", "Kia", "Yellow"));
    }

    public List<Car> getCars() {
        return cars;
    }

    public List<Car> getCars(int limit) {
        if (limit < 5) {
            return cars.stream().limit(limit).collect(Collectors.toList());
        }
        return cars;
    }
}

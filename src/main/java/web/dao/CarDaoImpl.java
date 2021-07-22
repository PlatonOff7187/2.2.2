package web.dao;


import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDaoImpl implements CarDao {
    private static final List<Car> carList = new ArrayList<>();

    static {
        carList.add(new Car("Toyota", "Camry", 1996));
        carList.add(new Car("Mercedes", "600", 1963));
        carList.add(new Car("Audi", "A8", 2001));
        carList.add(new Car("Ford", "Mustang", 1965));
        carList.add(new Car("BMW", "X6", 2008));
    }

    @Override
    public List<Car> getCars(int count) {
        if (count == 0) {
            return carList;
        }

        return carList.stream().limit(count).collect(Collectors.toList());
    }
}
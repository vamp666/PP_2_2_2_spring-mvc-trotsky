package web.dao;

import org.springframework.stereotype.Component;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarDAO {
    private List<Car> cars;

    {
        cars = new ArrayList<>();

        cars.add(new Car(1, "Toyota", "1"));
        cars.add(new Car(2, "Lincoln", "XXX"));
        cars.add(new Car(3, "Ford", "GG"));
        cars.add(new Car(4, "Opel", "KK"));
        cars.add(new Car(5, "Mazda", "4"));

    }

    public List<Car> index(int count) {
        List<Car> nElements = cars.subList(0, count);
        return nElements;
    }

}

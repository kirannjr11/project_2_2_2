package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
@Service
public class CarService {

    public List<Car> getcars(int count) {
        if (count <= 0) {
            return null;
        } else if (count >= cars().size()) {
            return cars();
        } else {
            List<Car> countList = new ArrayList<>();
            for (int i = 0; i < count; i++) {
                countList.add(cars().get(i));
            }
            return countList;
        }
    }
    private List<Car> cars() {
        List<Car> cars = new ArrayList<>();

        Car car1 = new Car("Tesla", "Silver", 1017);
        Car car2 = new Car("Toyota", "Black", 1019);
        Car car3 = new Car("Honda", "White", 1021);
        Car car4 = new Car("Tata", "Blue", 1014);
        Car car5 = new Car("Ford", "Grey", 2020);

        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);

        return cars;

    }
}

//package com.taxi.park;
//
//import com.taxi.vehicles.Car;
//import java.util.ArrayList;
//import java.util.List;
//
//public class TaxiPark {
//    private List<Car> cars;
//
//    public TaxiPark() {
//        cars = new ArrayList<>();
//    }
//
//    public void addCar(Car car) {
//        cars.add(car);
//    }
//
//    public List<Car> getCars() {
//        return cars;
//    }
//
//    // Тут будуть методи для підрахунку вартості, сортування, пошуку
//}

package com.taxi.park;

import com.taxi.vehicles.Car;

import java.util.ArrayList;
import java.util.List;

public class TaxiPark {
    private final List<Car> cars = new ArrayList<>();

    public void addCar(Car car) {
        cars.add(car);
    }

    public void showFleet() {
        if (cars.isEmpty()) {
            System.out.println("Таксопарк порожній.");
        } else {
            cars.forEach(System.out::println);
        }
    }

    public double calculateTotalCost() {
        return cars.stream().mapToDouble(Car::getCost).sum();
    }

    public void sortByFuelConsumption() {
        cars.sort((c1, c2) -> Double.compare(c1.getFuelConsumption(), c2.getFuelConsumption()));
    }

    // Доданий метод для пошуку автомобілів за діапазоном швидкостей
    public List<Car> findBySpeedRange(int minSpeed, int maxSpeed) {
        List<Car> result = new ArrayList<>();
        for (Car car : cars) {
            if (car.getMaxSpeed() >= minSpeed && car.getMaxSpeed() <= maxSpeed) {
                result.add(car);
            }
        }
        return result;
    }
}


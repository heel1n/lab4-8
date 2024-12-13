//package com.taxi.commands;
//
//public class FindBySpeedRangeCommand implements Command {
//    @Override
//    public void execute() {
//        System.out.println("Пошук автомобілів за діапазоном швидкості...");
//    }
//}




//package com.taxi.commands;
//
//import com.taxi.park.TaxiPark;
//import com.taxi.vehicles.Car;
//
//public class FindBySpeedRangeCommand implements Command {
//    private final TaxiPark taxiPark;
//    private final int minSpeed;
//    private final int maxSpeed;
//
//    public FindBySpeedRangeCommand(TaxiPark taxiPark, int minSpeed, int maxSpeed) { // Конструктор з параметрами TaxiPark, minSpeed, maxSpeed
//        this.taxiPark = taxiPark;
//        this.minSpeed = minSpeed;
//        this.maxSpeed = maxSpeed;
//    }
//
//    @Override
//    public void execute() {
//        System.out.println("Пошук автомобілів за діапазоном швидкості (" + minSpeed + " - " + maxSpeed + " км/год):");
//        for (Car car : taxiPark.getCars()) {
//            if (car.getMaxSpeed() >= minSpeed && car.getMaxSpeed() <= maxSpeed) {
//                System.out.println("Модель: " + car.getModel() +
//                        ", Швидкість: " + car.getMaxSpeed());
//            }
//        }
//    }
//}
package com.taxi.commands;

import com.taxi.park.TaxiPark;

public class FindBySpeedRangeCommand implements Command {
    private final TaxiPark taxiPark;
    private final int minSpeed;
    private final int maxSpeed;

    public FindBySpeedRangeCommand(TaxiPark taxiPark, int minSpeed, int maxSpeed) {
        this.taxiPark = taxiPark;
        this.minSpeed = minSpeed;
        this.maxSpeed = maxSpeed;
    }

    @Override
    public void execute() {
        System.out.println("Автомобілі в діапазоні швидкостей " + minSpeed + "-" + maxSpeed + ":");
        taxiPark.findBySpeedRange(minSpeed, maxSpeed).forEach(System.out::println);
    }

    @Override
    public String getDescription() {
        return "Знайти автомобілі за діапазоном швидкостей (" + minSpeed + "-" + maxSpeed + ")";
    }
}


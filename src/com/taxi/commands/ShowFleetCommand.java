//package com.taxi.commands;
//
//
//import com.taxi.park.TaxiPark;
//import com.taxi.vehicles.Car;
//
//public class ShowFleetCommand implements Command {
//    @Override
//    public void execute() {
//        System.out.println("Виведення списку автомобілів таксопарку...");
//    }
//}



//package com.taxi.commands;
//
//import com.taxi.park.TaxiPark;
//import com.taxi.vehicles.Car;
//
//public class ShowFleetCommand implements Command {
//    private final TaxiPark taxiPark;
//
//    public ShowFleetCommand(TaxiPark taxiPark) { // Конструктор з параметром TaxiPark
//        this.taxiPark = taxiPark;
//    }
//
//    @Override
//    public void execute() {
//        System.out.println("Список автомобілів у автопарку:");
//        for (Car car : taxiPark.getCars()) {
//            System.out.println("Модель: " + car.getModel() +
//                    ", Ціна: " + car.getPrice() +
//                    ", Витрата пального: " + car.getFuelConsumption() +
//                    ", Максимальна швидкість: " + car.getMaxSpeed());
//        }
//    }
//}

package com.taxi.commands;

import com.taxi.park.TaxiPark;

public class ShowFleetCommand implements Command {
    private final TaxiPark taxiPark;

    public ShowFleetCommand(TaxiPark taxiPark) {
        this.taxiPark = taxiPark;
    }

    @Override
    public void execute() {
        taxiPark.showFleet();
    }

    @Override
    public String getDescription() {
        return "Показати всі автомобілі в таксопарку";
    }
}


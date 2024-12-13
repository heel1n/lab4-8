//package com.taxi.commands;
//
//public class SortByFuelConsumptionCommand implements Command {
//    @Override
//    public void execute() {
//        System.out.println("Сортування автомобілів за витратою пального...");
//    }
//}






//package com.taxi.commands;
//
//import com.taxi.park.TaxiPark;
//import com.taxi.vehicles.Car;
//
//import java.util.List;
//
//public class SortByFuelConsumptionCommand implements Command {
//    private final TaxiPark taxiPark;
//
//    public SortByFuelConsumptionCommand(TaxiPark taxiPark) { // Конструктор з параметром TaxiPark
//        this.taxiPark = taxiPark;
//    }
//
//    @Override
//    public void execute() {
//        System.out.println("Сортування автомобілів за витратою пального:");
//        List<Car> cars = taxiPark.getCars();
//        cars.sort((car1, car2) -> Double.compare(car1.getFuelConsumption(), car2.getFuelConsumption()));
//
//        for (Car car : cars) {
//            System.out.println("Модель: " + car.getModel() +
//                    ", Витрата пального: " + car.getFuelConsumption() + " л/100 км");
//        }
//    }
//}
package com.taxi.commands;

import com.taxi.park.TaxiPark;

public class SortByFuelConsumptionCommand implements Command {
    private final TaxiPark taxiPark;

    public SortByFuelConsumptionCommand(TaxiPark taxiPark) {
        this.taxiPark = taxiPark;
    }

    @Override
    public void execute() {
        taxiPark.sortByFuelConsumption();
        System.out.println("Сортування за витратою пального виконано.");
    }

    @Override
    public String getDescription() {
        return "Сортувати автомобілі за витратою пального";
    }
}

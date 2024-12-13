//package com.taxi.commands;
//
//public class CalculateCostCommand implements Command {
//    @Override
//    public void execute() {
//        System.out.println("Підрахунок вартості автопарку...");
//    }
//
//}

//package com.taxi.commands;
//import com.taxi.park.TaxiPark;


//public class CalculateCostCommand implements Command {
//    private final TaxiPark taxiPark;
//
//    public CalculateCostCommand(TaxiPark taxiPark) { // Конструктор з параметром TaxiPark
//        this.taxiPark = taxiPark;
//    }
//
//    @Override
//    public void execute() {
//        System.out.println("Підрахунок вартості автопарку...");
//        double totalCost = 0;
//        for (var car : taxiPark.getCars()) {
//            totalCost += car.getPrice();
//        }
//        System.out.println("Загальна вартість автопарку: " + totalCost);
//    }
//}
package com.taxi.commands;

import com.taxi.park.TaxiPark;

public class CalculateCostCommand implements Command {
    private final TaxiPark taxiPark;

    public CalculateCostCommand(TaxiPark taxiPark) {
        this.taxiPark = taxiPark;
    }

    @Override
    public void execute() {
        System.out.println("Загальна вартість таксопарку: " + taxiPark.calculateTotalCost());
    }

    @Override
    public String getDescription() {
        return "Підрахувати загальну вартість всіх автомобілів у таксопарку";
    }
}

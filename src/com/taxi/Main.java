//package com.taxi;
//
//import com.taxi.menu.Menu;
//
//public class Main {
//    public static void main(String[] args) {
//        Menu menu = new Menu();
//        menu.handleInput();
//    }
//}

//package com.taxi.main;
//
//import com.taxi.commands.*;
//import com.taxi.menu.Menu;
//import com.taxi.park.TaxiPark;
//
//import java.util.HashMap;
//import java.util.Map;
//
//public class Main {
//    public static void main(String[] args) {
//        TaxiPark taxiPark = new TaxiPark();
//
//        Map<Integer, Command> commands = new HashMap<>();
//        commands.put(1, new ShowFleetCommand(taxiPark));
//        commands.put(2, new CalculateCostCommand(taxiPark));
//        commands.put(3, new SortByFuelConsumptionCommand(taxiPark));
//        commands.put(4, new FindBySpeedRangeCommand(taxiPark, 100, 200));
//        commands.put(5, new AddCarCommand(taxiPark));
//
//        Menu menu = new Menu(commands);
//        menu.start();
//    }
//}


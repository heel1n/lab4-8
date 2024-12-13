//package com.taxi.menu;
//
//import com.taxi.commands.*;
//import com.taxi.park.TaxiPark;
//
//import java.util.HashMap;
//import java.util.Map;
//import java.util.Scanner;
//
//public class Menu {
//    private TaxiPark taxiPark;
//    private Map<Integer, Command> commands;
//
//    public Menu() {
//        this.taxiPark = new TaxiPark();
//        this.commands = new HashMap<>();
//        initializeCommands();
//    }
//
//    // Ініціалізація команд
//    private void initializeCommands() {
//        taxiPark.addCar(new com.taxi.vehicles.Sedan("Toyota Corolla", 20000, 6.5, 180));
//        taxiPark.addCar(new com.taxi.vehicles.SUV("Range Rover", 50000, 10.5, 220));
//
//        commands.put(1, new ShowFleetCommand(taxiPark));
//        commands.put(2, new CalculateCostCommand(taxiPark));
//        commands.put(3, new SortByFuelConsumptionCommand(taxiPark));
//        commands.put(4, new FindBySpeedRangeCommand(taxiPark, 100, 200));
//        commands.put(5, new AddCarCommand(taxiPark));
//    }
//
//    // Виведення меню
//    private void displayMenu() {
//        System.out.println("\nМеню:");
//        System.out.println("1. Показати таксопарк");
//        System.out.println("2. Підрахувати вартість");
//        System.out.println("3. Сортувати за витратою пального");
//        System.out.println("4. Пошук за швидкістю");
//        System.out.println("5. Додати новий автомобіль");
//        System.out.println("0. Вихід");
//    }
//
//    // Обробка вводу користувача
//    public void handleInput() {
//        Scanner scanner = new Scanner(System.in);
//        boolean exit = false;
//
//        while (!exit) {
//            displayMenu();
//            System.out.print("Ваш вибір: ");
//            int choice = scanner.nextInt();
//
//            if (choice >= 1 && choice <= 5) {
//                commands.get(choice).execute();
//            } else if (choice == 0) {
//                exit = true;
//                System.out.println("Вихід з програми...");
//            } else {
//                System.out.println("Невірний вибір. Спробуйте ще раз.");
//            }
//        }
//
//        scanner.close();
//    }
//}

package com.taxi.menu;

import com.taxi.commands.Command;

import java.util.Map;
import java.util.Scanner;

public class Menu {
    private final Map<Integer, Command> commands;

    public Menu(Map<Integer, Command> commands) {
        this.commands = commands;
    }

    public void showDescriptions() {
        System.out.println("Доступні команди:");
        for (Map.Entry<Integer, Command> entry : commands.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue().getDescription());
        }
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nМеню:");
            showDescriptions();
            System.out.println("0: Вихід");

            System.out.print("Виберіть команду: ");
            int choice = scanner.nextInt();

            if (choice == 0) {
                System.out.println("Вихід з програми...");
                break;
            }

            if (commands.containsKey(choice)) {
                commands.get(choice).execute();
            } else {
                System.out.println("Невірний вибір. Спробуйте ще раз.");
            }
        }
        scanner.close();
    }
}


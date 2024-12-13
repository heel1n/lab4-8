////package com.taxi.main;
////
////import com.taxi.commands.*;
////import com.taxi.park.TaxiPark;
////import com.taxi.vehicles.Sedan;
////import com.taxi.vehicles.SUV;
////
////import java.util.Scanner;
////
////public class Main {
////    public static void main(String[] args) {
////        TaxiPark taxiPark = new TaxiPark();
////        taxiPark.addCar(new Sedan("Toyota Corolla", 20000, 6.5, 180));
////        taxiPark.addCar(new SUV("Range Rover", 50000, 10.5, 220));
////
////        Scanner scanner = new Scanner(System.in);
////        Command[] commands = {
////                new ShowFleetCommand(),
////                new CalculateCostCommand(),
////                new SortByFuelConsumptionCommand(),
////                new FindBySpeedRangeCommand()
////        };
////
////        while (true) {
////            System.out.println
////                    ("\n1. Показати таксопарк" +
////                    "\n2. Підрахувати вартість" +
////                    "\n3. Сортувати за витратою пального" +
////                    "\n4. Пошук за швидкістю" +
////                    "\n5. Вихід");
////            int choice = scanner.nextInt();
////
////            if (choice >= 1 && choice <= 4) {
////                commands[choice - 1].execute();
////            } else if (choice == 5) {
////                break;
////            } else {
////                System.out.println("Невірний вибір. Спробуйте ще раз.");
////            }
////        }
////        scanner.close();
////    }
////}
//
//
////package com.taxi.main;
////
////import com.taxi.commands.*;
////        import com.taxi.park.TaxiPark;
////import com.taxi.vehicles.Sedan;
////import com.taxi.vehicles.SUV;
////
////import java.util.HashMap;
////import java.util.Map;
////import java.util.Scanner;
//
////public class Main {
////    public static void main(String[] args) {
////        TaxiPark taxiPark = new TaxiPark();
////        taxiPark.addCar(new Sedan("Toyota Corolla", 20000, 6.5, 180));
////        taxiPark.addCar(new SUV("Range Rover", 50000, 10.5, 220));
////
////        // Ініціалізація команд
////        Map<Integer, Command> commands = new HashMap<>();
////        commands.put(1, new ShowFleetCommand(taxiPark));
////        commands.put(2, new CalculateCostCommand(taxiPark));
////        commands.put(3, new SortByFuelConsumptionCommand(taxiPark));
////        commands.put(4, new FindBySpeedRangeCommand(taxiPark, 150, 200));
////
////        Scanner scanner = new Scanner(System.in);
////        boolean exit = false;
////
////        while (!exit) {
////            // Виведення меню
////            System.out.println("\n1. Показати таксопарк");
////            System.out.println("2. Підрахувати вартість");
////            System.out.println("3. Сортувати за витратою пального");
////            System.out.println("4. Пошук за швидкістю");
////            System.out.println("5. Вихід");
////
////            System.out.print("Виберіть команду: ");
////            int choice = scanner.nextInt();
////
////            if (commands.containsKey(choice)) {
////                // Виконання обраної команди
////                commands.get(choice).execute();
////            } else if (choice == 5) {
////                // Завершення програми
////                exit = true;
////                System.out.println("Вихід з програми...");
////            } else {
////                System.out.println("Невірний вибір. Спробуйте ще раз.");
////            }
////        }
////
////        scanner.close();
////    }
////}
//
//
//
//package com.taxi.main;
//
//import com.taxi.commands.*;
//        import com.taxi.park.TaxiPark;
//import com.taxi.vehicles.Sedan;
//import com.taxi.vehicles.SUV;
//
//import java.util.HashMap;
//import java.util.Map;
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        TaxiPark taxiPark = new TaxiPark();
//        taxiPark.addCar(new Sedan("Toyota Corolla", 20000, 6.5, 180));
//        taxiPark.addCar(new SUV("Range Rover", 50000, 10.5, 220));
//
//        Map<Integer, Command> commands = new HashMap<>();
//        commands.put(1, new ShowFleetCommand(taxiPark));
//        commands.put(2, new CalculateCostCommand(taxiPark));
//        commands.put(3, new SortByFuelConsumptionCommand(taxiPark));
//        commands.put(4, new FindBySpeedRangeCommand(taxiPark, 100, 200));
//        commands.put(5, new AddCarCommand(taxiPark));
//
//        Scanner scanner = new Scanner(System.in);
//        boolean exit = false;
//
//        while (true) {
//            System.out.println("\nМеню:");
//            System.out.println("1. Показати таксопарк");
//            System.out.println("2. Підрахувати вартість");
//            System.out.println("3. Сортувати за витратою пального");
//            System.out.println("4. Пошук за швидкістю");
//            System.out.println("5. Додати новий автомобіль");
//            System.out.println("6. Вихід");
//
//            int choice = scanner.nextInt();
//
//            if (choice >= 1 && choice <= 5) {
//                commands.get(choice).execute();
//            } else if (choice == 6) {
//                break;
//            } else {
//                System.out.println("Невірний вибір. Спробуйте ще раз.");
//            }
//        }
//        scanner.close();
//    }
//}
//

package com.taxi.main;

import com.taxi.commands.*;
import com.taxi.menu.Menu;
import com.taxi.park.TaxiPark;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        TaxiPark taxiPark = new TaxiPark();

        Map<Integer, Command> commands = new HashMap<>();
        commands.put(1, new ShowFleetCommand(taxiPark));
        commands.put(2, new CalculateCostCommand(taxiPark));
        commands.put(3, new SortByFuelConsumptionCommand(taxiPark));
        commands.put(4, new FindBySpeedRangeCommand(taxiPark, 100, 200));
        commands.put(5, new AddCarCommand(taxiPark));

        Menu menu = new Menu(commands);
        menu.start();
    }
}

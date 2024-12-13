//package com.taxi.commands;
//
//import com.taxi.park.TaxiPark;
//import com.taxi.vehicles.Car;
//import com.taxi.vehicles.Sedan;
//import com.taxi.vehicles.SUV;
//
//import java.util.Scanner;
//
//public class AddCarCommand implements Command {
//    private final TaxiPark taxiPark;
//
//    public AddCarCommand(TaxiPark taxiPark) {
//        this.taxiPark = taxiPark;
//    }
//
//    @Override
//    public void execute() {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Виберіть тип автомобіля для додавання (1 - Sedan, 2 - SUV): ");
//        int typeChoice = scanner.nextInt();
//        scanner.nextLine(); // Споживаємо нову лінію після числа
//
//        System.out.println("Введіть модель автомобіля:");
//        String model = scanner.nextLine();
//
//        System.out.println("Введіть ціну автомобіля:");
//        double price = scanner.nextDouble();
//
//        System.out.println("Введіть витрату пального автомобіля (л/100 км):");
//        double fuelConsumption = scanner.nextDouble();
//
//        System.out.println("Введіть максимальну швидкість автомобіля:");
//        int maxSpeed = scanner.nextInt();
//
//        Car car;
//        if (typeChoice == 1) {
//            car = new Sedan(model, price, fuelConsumption, maxSpeed);
//        } else if (typeChoice == 2) {
//            car = new SUV(model, price, fuelConsumption, maxSpeed);
//        } else {
//            System.out.println("Невірний вибір типу автомобіля.");
//            return;
//        }
//
//        taxiPark.addCar(car);
//        System.out.println("Автомобіль успішно додано до автопарку.");
//    }
//}

package com.taxi.commands;

import com.taxi.park.TaxiPark;
import com.taxi.vehicles.Car;
import com.taxi.vehicles.Sedan;
import com.taxi.vehicles.SUV;

import java.util.Scanner;

public class AddCarCommand implements Command {
    private final TaxiPark taxiPark;

    public AddCarCommand(TaxiPark taxiPark) {
        this.taxiPark = taxiPark;
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть тип автомобіля (Sedan/SUV): ");
        String type = scanner.nextLine();

        System.out.println("Введіть назву автомобіля: ");
        String name = scanner.nextLine();

        System.out.println("Введіть вартість автомобіля: ");
        double cost = scanner.nextDouble();

        System.out.println("Введіть витрату пального: ");
        double fuelConsumption = scanner.nextDouble();

        System.out.println("Введіть максимальну швидкість: ");
        int maxSpeed = scanner.nextInt();

        Car car = null;
        if (type.equalsIgnoreCase("Sedan")) {
            car = new Sedan(name, cost, fuelConsumption, maxSpeed);
        } else if (type.equalsIgnoreCase("SUV")) {
            car = new SUV(name, cost, fuelConsumption, maxSpeed);
        }

        if (car != null) {
            taxiPark.addCar(car);
            System.out.println("Автомобіль успішно додано!");
        } else {
            System.out.println("Невірний тип автомобіля.");
        }
    }

    @Override
    public String getDescription() {
        return "Додати новий автомобіль до таксопарку";
    }
}


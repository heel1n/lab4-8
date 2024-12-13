//package com.taxi.vehicles;
//
//public abstract class Car {
//    private String model;
//    private double price;
//    private double fuelConsumption;
//    private int maxSpeed;
//
//    public Car(String model, double price, double fuelConsumption, int maxSpeed) {
//        this.model = model;
//        this.price = price;
//        this.fuelConsumption = fuelConsumption;
//        this.maxSpeed = maxSpeed;
//    }
//
//    // Гетери та сетери
//    public String getModel() { return model; }
//    public double getPrice() { return price; }
//    public double getFuelConsumption() { return fuelConsumption; }
//    public int getMaxSpeed() { return maxSpeed; }
//
//    @Override
//    public String toString() {
//        return model + " - " + price + "$, " + fuelConsumption + "л/100км, " + maxSpeed + " км/год";
//    }
//}

package com.taxi.vehicles;

public abstract class Car {
    private String model;
    private double cost;
    private double fuelConsumption;
    private int maxSpeed;

    public Car(String model, double cost, double fuelConsumption, int maxSpeed) {
        this.model = model;
        this.cost = cost;
        this.fuelConsumption = fuelConsumption;
        this.maxSpeed = maxSpeed;
    }

    public String getModel() {
        return model;
    }

    public double getCost() {
        return cost;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    @Override
    public String toString() {
        return String.format("%s: вартість $%.2f, витрата %.1f л/100 км, макс. швидкість %d км/год",
                model, cost, fuelConsumption, maxSpeed);
    }
}

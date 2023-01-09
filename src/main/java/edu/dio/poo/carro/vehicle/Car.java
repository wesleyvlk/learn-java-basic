package edu.dio.poo.carro.vehicle;

public class Car extends Vehicle {
    private String color;
    private String model;
    private int maxCapFuel;

    public Car() {
    }

    public Car(String color, String model, int maxCapFuel) {
        this.color = color;
        this.model = model;
        this.maxCapFuel = maxCapFuel;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMaxCapFuel() {
        return maxCapFuel;
    }

    public void setMaxCapFuel(int maxCapFuel) {
        this.maxCapFuel = maxCapFuel;
    }

    public double tankValue(double fuelValue) {
        return maxCapFuel * fuelValue;
    }
}
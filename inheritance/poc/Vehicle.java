package com.inheritance.poc;

public class Vehicle {

    // Encapsulation - private variables
    private int vehicleId;
    private String brand;
    private String model;
    private double rentPerDay;

    // Getters and Setters

    public int getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(int vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getRentPerDay() {
        return rentPerDay;
    }

    public void setRentPerDay(double rentPerDay) {
        this.rentPerDay = rentPerDay;
    }

    public double calculateRent(int days) {
        return rentPerDay * days;
    }

    public void displayVehicle() {
        System.out.println("Vehicle ID  : " + vehicleId);
        System.out.println("Brand       : " + brand);
        System.out.println("Model       : " + model);
        System.out.println("Rent/Day    : " + rentPerDay);
    }
}
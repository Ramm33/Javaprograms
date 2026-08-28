package com.inheritance;

abstract class Vehicle {

    private int vehicleId;
    private String brand;
    private String model;
    private double rentPerDay;

    Vehicle(int vehicleId, String brand, String model, double rentPerDay) {
        this.vehicleId = vehicleId;
        this.brand = brand;
        this.model = model;
        this.rentPerDay = rentPerDay;
    }

    // Getters
    public int getVehicleId() {
        return vehicleId;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getRentPerDay() {
        return rentPerDay;
    }

    // Setters
    public void setVehicleId(int vehicleId) {
        this.vehicleId = vehicleId;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setRentPerDay(double rentPerDay) {
        this.rentPerDay = rentPerDay;
    }

    // Abstraction
    abstract void calculateRent(int days);

    public void displayDetails() {
        System.out.println("Vehicle ID : " + vehicleId);
        System.out.println("Brand      : " + brand);
        System.out.println("Model      : " + model);
        System.out.println("Rent/Day   : " + rentPerDay);
    }
}
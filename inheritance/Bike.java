package com.inheritance;

class Bike extends Vehicle {

    Bike(int vehicleId, String brand, String model, double rentPerDay) {
        super(vehicleId, brand, model, rentPerDay);
    }

    @Override
    void calculateRent(int days) {
        double total = (getRentPerDay() * days) + 100;
        System.out.println("Total Bike Rent : " + total);
    }
}
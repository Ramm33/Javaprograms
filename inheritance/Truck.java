package com.inheritance;

class Truck extends Vehicle {

    Truck(int vehicleId, String brand, String model, double rentPerDay) {
        super(vehicleId, brand, model, rentPerDay);
    }

    @Override
    void calculateRent(int days) {
        double total = (getRentPerDay() * days) + 500;
        System.out.println("Total Truck Rent : " + total);
    }
}
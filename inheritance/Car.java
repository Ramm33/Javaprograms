package com.inheritance;

class Car extends Vehicle {

    Car(int vehicleId, String brand, String model, double rentPerDay) {
        super(vehicleId, brand, model, rentPerDay);
    }

    @Override
    void calculateRent(int days) {
        double total = getRentPerDay() * days;
        System.out.println("Total Car Rent : " + total);
    }
}
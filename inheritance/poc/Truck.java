package com.inheritance.poc;

public class Truck extends Vehicle {

    @Override
    public double calculateRent(int days) {
        return getRentPerDay() * days + 5000;
    }
}
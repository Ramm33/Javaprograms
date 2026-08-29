package com.inheritance.poc;

public class Bike extends Vehicle {

    @Override
    public double calculateRent(int days) {
        return getRentPerDay() * days + 1000;
    }
}
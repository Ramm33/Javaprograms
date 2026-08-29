package com.inheritance.poc;


public class Car extends Vehicle {

    @Override
    public double calculateRent(int days) {
        return getRentPerDay() * days + 3000;
    }
}
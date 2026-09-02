package com.oops;

public class Car22 extends Vehicle21 {

    public void drive() {
        System.out.println("Car is driving");
    }

    public static void main(String[] args) {

        Car22 c = new Car22();

        c.start();
        c.drive();
    }
}
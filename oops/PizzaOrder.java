package com.oops;

public class PizzaOrder extends FoodOrder {

    PizzaOrder(int orderId, String customerName, double price) {
        super(orderId, customerName, price);
    }

    @Override
    void prepareFood() {
        System.out.println("Preparing Pizza...");
    }
}

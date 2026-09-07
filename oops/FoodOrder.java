package com.oops;

public abstract  class FoodOrder extends OrderDetails {

    FoodOrder(int orderId, String customerName, double price) {
        super(orderId, customerName, price);
    }

    abstract void prepareFood();
}
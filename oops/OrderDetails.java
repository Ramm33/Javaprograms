package com.oops;

public  class OrderDetails {
    int orderId;
    String customerName;
    double price;

    OrderDetails(int orderId, String customerName, double price) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.price = price;
    }

    void displayDetails() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Price: " + price);
    }
}


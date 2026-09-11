package com.oops;

public class TestDriver32 {

    public static void main(String[] args) {

        Product31 p1 = new Electronics(101, "Laptop", 60000, "Dell");
        Product31 p2 = new Clothing(102, "T-Shirt", 2000, "Nike");
        Product31 p3 = new Furniture(103, "Chair", 5000, "Wood");

        Product31[] products = {p1, p2, p3};

        for (Product31 p : products) {

            System.out.println("-----------------------------");

            p.displayProductDetails();

            double discount = p.calculateDiscount1();
            double finalPrice = p.price - discount;

            System.out.println("Discount     : " + discount);
            System.out.println("Final Price  : " + finalPrice);
        }
    }
}
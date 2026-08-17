package com.languagefundamentals;

public class DefaultConstructor {
        int productId;
	    String productName;
	    double price;
	    DefaultConstructor(int productId, String productName, double price) {
	        this.productId = productId;
	        this.productName = productName;
	        this.price = price;
	    
	    }

	    void displayDetails() {
	        System.out.println("Product ID   : " + productId);
	        System.out.println("Product Name : " + productName);
	        System.out.println("Price        : " + price);
	        System.out.println("---------------------------");
	    }

	    public static void main(String[] args) {

	        DefaultConstructor p1 = new DefaultConstructor(101, "Laptop", 55000.0);
	        DefaultConstructor p2 = new DefaultConstructor(102, "Mobile", 25000.0);
	        DefaultConstructor p3 = new DefaultConstructor(103, "Headphones", 2000.0);

	        p1.displayDetails();
	        p2.displayDetails();
	        p3.displayDetails();
	    }
	}
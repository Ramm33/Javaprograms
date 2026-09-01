package com.oops;

public class Oops16 {
	public static void main(String[] args) {

		Oops15 cart = new Oops15();

		cart.addItem("Laptop", 50000);
		cart.addItem("Mouse", 1000);
		cart.addItem("Keyboard", 2000);

		cart.removeItem("Mouse", 1000);

		System.out.println("Cart Items: " + cart.cartItems);
		System.out.println("Total Amount: ₹" + cart.getTotal());
	}
}
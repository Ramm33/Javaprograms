package com.oops;

//Create a Java class named ShoppingCart using Encapsulation.
//Declare private variables cartItems and totalAmount.
//Implement addItem(), removeItem(), and getTotal() methods.
//Add and remove items by updating the cart details appropriately.
//In the main() method, display the total amount after performing the operations.
public class Oops15 {

	String cartItems;
	private double totalAmount;

	void ShoppingCart() {
		cartItems = "";
		totalAmount = 0;
	}

	void addItem(String item, double price) {
		cartItems = cartItems + item + " ";
		totalAmount = totalAmount + price;
	}

	void removeItem(String item, double price) {
		cartItems = cartItems.replace(item + " ", "");
		totalAmount = totalAmount - price;
	}

	double getTotal() {
		return totalAmount;
	}

	public void setCartItems(String cartItems) {
		this.cartItems = cartItems;
	}

	public String getCartItems() {
		return cartItems;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public double getTotalAmount() {
		return totalAmount;
	}

}
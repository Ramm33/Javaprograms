package com.oops;

class BurgerOrder extends FoodOrder {

    BurgerOrder(int orderId, String customerName, double price) {
        super(orderId, customerName, price);
    }

    @Override
    void prepareFood() {
        System.out.println("Preparing Burger...");
    }
}


public class BurderOrder {

	public static void main(String[] args) {
		FoodOrder order;
		System.out.println();
		System.out.println("YOUR ORDER IS PREPARING PLEASE WAIT FOR FEW MINUTES...");
		System.out.println();
		
        order = new PizzaOrder(6141, "Karthik", 250);
        order.prepareFood();
        order.displayDetails();

        System.out.println();

        order = new BurgerOrder(6142, "Karthik", 180);
        order.prepareFood();
        order.displayDetails();

	}

}

package com.oops;

class Product31 {

	int productId;
	String productName;
	double price;

	Product31(int productId, String productName, double price) {
		this.productId = productId;
		this.productName = productName;
		this.price = price;
	}

	void displayProductDetails() {
		System.out.println("Product ID   : " + productId);
		System.out.println("Product Name : " + productName);
		System.out.println("Price        : " + price);
	}

	double calculateDiscount1() {
		return 0;
	}

}

class Electronics extends Product31 {
	String brand;

	Electronics(int productId, String productName, double price, String brand) {
		super(productId, productName, price);
		this.brand = brand;
	}

	@Override
	void displayProductDetails() {
		super.displayProductDetails();
		System.out.println("Brand        : " + brand);
	}

	@Override
	double calculateDiscount1() {
		return price * 0.10;
	}
}

class Clothing extends Product31 {
	String size;

	Clothing(int productId, String productName, double price, String size) {
		super(productId, productName, price);
		this.size = size;
	}

	@Override
	void displayProductDetails() {
		super.displayProductDetails();
		System.out.println("Size         : " + size);
	}

	@Override
	double calculateDiscount1() {
		return price * 0.20;
	}
}

class Furniture extends Product31 {
	String material;

	Furniture(int productId, String productName, double price, String material) {
		super(productId, productName, price);
		this.material = material;
	}

	@Override
	void displayProductDetails() {
		super.displayProductDetails();
		System.out.println("Material     : " + material);
	}

	@Override
	double calculateDiscount1() {
		return price * 0.15;
	}
}
package com.oops;
//concept used for : 
//Encapsulation the employee variables are private ,
//and they are accessing through getters and  Setters
public class Oops4 {

	public static void main(String[] args) {

		Product p1 = new Product();

		p1.setPid(10);
		p1.setPname("Laptop");
		p1.setPrice(95000);

		System.out.println(p1.getPid());
		System.out.println(p1.getPname());
		System.out.println(p1.getPrice());
	}
}
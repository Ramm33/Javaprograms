package com.javaintro;

public class Cars {
	static int count = 0;
	
	String name;
	
	Cars(String name){
		this.name = name;
		count++;
		
	}
	void display() {
		System.out.println("CarsName"+name);
		
	}

	public static void main(String[] args) {
		Cars c1 = new Cars(" benz");
		Cars c2 = new Cars(" TATA SAFARI");
		Cars c3 = new Cars(" BMW");
		
		c1.display();
		c2.display();
		c3.display();
		
		Cars c6 = new Cars(" Toyota");
		Cars c5 = new Cars(" MG");
		Cars c4 = new Cars(" RR");
		
		c4.display();
		c5.display();
		c6.display();
		
		System.out.println("Total No Of objects created:"+Cars.count);

		
		
	}

}

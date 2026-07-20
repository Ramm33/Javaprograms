package com.javaintro;

public class Rectangle {
	static void main() {
	int length = 10;
	int breadth = 10;
	int area = length*breadth;
	int perimeter=2*(length+breadth);
	System.out.println("length=" + length);
	System.out.println("breadth ="+ breadth);
	System.out.println("area of rectangle="+area);
	
	}
	
	
	public static void main(String[] args) {
		System.out.println("main method started");
		Rectangle obj = new Rectangle();
		obj.main();
		
		
		
		
		

	}

}

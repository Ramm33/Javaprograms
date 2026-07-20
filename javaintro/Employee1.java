package com.javaintro;

public class Employee1 {
	@Override
	protected void finalize(){
		System.out.println("Object is eligible for Garbage Collection\r\n"
				+ "Garbage Collector Called");
		
	}

	public static void main(String[] args) {
		Employee1 e1 = new Employee1();
		System.out.println(e1);
		
		Employee1 e2 = new Employee1();
		System.out.println(e2);
		
		Employee1 e3 = new Employee1();
		System.out.println(e3);
		e1 = null;
		e2 = null;
		
		System.gc();
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);


	}

}

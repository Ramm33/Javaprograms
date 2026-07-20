
package com.javaintro;
public class TestDemo1 {
	static int id = 123;
	public static void main(String[] args) {
		System.out.println("main method started ");
		TestDemo1 t = new TestDemo1();
		t=null;
		t.id = 456;
		System.out.println(id);
		hello(); // calling the method
//		t.welcome();
	}
	static void hello() {
		System.out.println("Hello !! Good Morning ");
		System.out.println("Hello !! Good Morning ");
		System.out.println("Hello !! Good Morning ");
	}
	void welcome() {
		System.out.println("Welcome to Java World !");
	}
}




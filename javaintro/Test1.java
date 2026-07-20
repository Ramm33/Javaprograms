package com.javaintro;
public class Test1 {
	static {
		System.out.println("static block1 loaded ");
	}
	static Test1 t = new Test1();
	public static void main(String[] args) {
		System.out.println("main method started ");
	}
	{
		System.out.println("instance block1 loaded ");
	}
	static {
		System.out.println("static block2 loaded ");
	}
	{
		System.out.println("instance block2 loaded ");
	}
}

package com.oops;

public class Oops12 {

	public static void main(String[] args) {

		Oops11 b = new Oops11();

		b.setBookid(101);
		b.setTitle("Java Programming");
		b.setAuthor("James Gosling");
		b.setPrice(599.50);

		System.out.println("Book ID : " + b.getBookid());
		System.out.println("Title   : " + b.getTitle());
		System.out.println("Author  : " + b.getAuthor());
		System.out.println("Price   : " + b.getPrice());
	}
}
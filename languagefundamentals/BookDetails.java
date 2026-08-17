package com.languagefundamentals;
import java.util.Scanner;

public class BookDetails {
	int bookId;
	String bookName;
	String authorName;
	double price;
	
	BookDetails(int bookId,String bookName,String authorName,double price){
		this.bookId=bookId;
		this.bookName=bookName;
		this.authorName=authorName;
		this.price=price;
	}
	void display() {
		System.out.println("\nBookDetails:");
		System.out.println("BookID:"+bookId);
		System.out.println("AuhtorName:"+authorName);
		System.out.println("BookName:"+bookName);
		System.out.println("Price:"+price);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter BookID:");
		int id = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter Book Name");
		String name=sc.nextLine();
		
		System.out.println("Enter Author Name");
		String author=sc.nextLine();	
		
		System.out.println("Enter Book Price:");
		double price=sc.nextDouble();
		BookDetails book= new BookDetails(id,name,author,price);
		book.display();
		
	}

}

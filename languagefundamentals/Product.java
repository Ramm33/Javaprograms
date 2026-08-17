package com.languagefundamentals;
import java.util.Scanner;
public class Product {
	String ProductName;
	double Price;
	int Quantity;
	
	Product() {
		this("unknown");
	}
	Product(String ProductName){
		this.ProductName=ProductName;
		}
	Product(String ProductName,double Price){
		this(ProductName,Price,0);
	}
	Product(String ProductName,double Price,int Quantity){
		this.ProductName=ProductName;
		this.Price=Price;
		this.Quantity=Quantity;
		
	}
	void display() {
		double Totalcost=Price*Quantity;
        System.out.println("ProductName:"+ProductName);
		System.out.println("Price:"+Price);
		System.out.println("Quantity:"+Quantity);
		System.out.println("Totalcost:"+Totalcost);
		
   }
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter ProductName:");
		String Name =sc.nextLine();
		System.out.println("Enter Product Price:");
		double Price =sc.nextDouble();
		System.out.println("Enter Product Quantity:");
		int Quantity=sc.nextInt();
		Product p=new Product(Name,Price,Quantity);
		p.display();

	}

}

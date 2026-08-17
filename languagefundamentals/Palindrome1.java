package com.languagefundamentals;
import java.util.Scanner;

 class Palindrome1 {

	public static void main(String[] args) {
		String s= new Scanner(System.in).next();
		if(s.equals(new StringBuilder(s).reverse().toString()))
		    System.out.println("Palindrome1");
		else
			System.out.println("Not Palindrome1");
	}

}

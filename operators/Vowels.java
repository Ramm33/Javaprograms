package com.operators;

import java.util.Scanner;

public class Vowels {
	public static void main(String[] args) {
		System.out.println("main method Started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Character");
		char ch = sc.next().charAt(0);
		ch = Character.toLowerCase(ch);

		String result = (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E'
				|| ch == 'I' || ch == 'O' || ch == 'U') ? "Vowel" : "Consonant";

		System.out.println("Character = " + ch);
		System.out.println(result);
	}
}
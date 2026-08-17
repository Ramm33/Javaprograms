package com.Loops;

import java.util.Random;
import java.util.Scanner;

public class GuessRandomNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random random = new Random();

		int number = random.nextInt(10) + 1;

		for (int i = 1; i <=3; i++) {

			System.out.println("Enter your guess :");
			int guess = sc.nextInt();

			if (guess == number) {
				System.out.println("You Won!");
				break;
			} else {
				System.out.println("Wrong Guess!");

				if (i == 3) {
					System.out.println("Better Luck nextTime");
					System.out.println("Random Number was: " + number);
				}
			}
		}

		sc.close();
	}
}

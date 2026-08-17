//Write a Program to print Minimum &Maximum Numbers
package com.arrays;

public class MinMax {

	public static void main(String[] args) {
		int[] numbers = { 12, 45, 2, 67, 23, 89, 5 };
		int Min = numbers[0];
		int Max = numbers[0];
		// Using ForLOOP
		

//Using For Each Loop:		
		for (int n : numbers) {
			if (n < Min) {
				Min = n;
			}
			if (n > Max) {
				Max = n;
			}

		}
		System.out.println("Minimum:" + Min);
		System.out.println("Maximum:" + Max);
	}

}



//import java.util.Random;
//import java.util.Scanner;
//
//public class GuessNumber {
//
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//        Random random = new Random();
//
//        int number = random.nextInt(10) + 1;
//
//        for (int attempt = 1; attempt <= 3; attempt++) {
//
//            System.out.println("Enter your guess (1-10):");
//            int guess = sc.nextInt();
//
//            if (guess == number) {
//                System.out.println("You Won!");
//                break;
//            } 
//            else {
//                System.out.println("Wrong Guess!");
//
//                if (attempt == 3) {
//                    System.out.println("You Lost!");
//                    System.out.println("Random Number was: " + number);
//                }
//            }
//        }
//
//        sc.close();
//    }
//}

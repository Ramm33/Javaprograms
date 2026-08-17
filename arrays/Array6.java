package com.arrays;
import java.util.Scanner;
public class Array6 {
	   public static void main(String[] args) {
	        int[] arr = {4, 8, 15, 16, 23, 42};
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter number to search:");
	        int key = sc.nextInt();

	        boolean found = false;
	        for (int i = 0; i < arr.length; i++) {
	            if (arr[i] == key) {
	                System.out.println("Found at index " + i);
	                found = true;
	                break;
	            }
	        }
	        if (!found) {
	            System.out.println("Not found");
	        }
	    }
	}
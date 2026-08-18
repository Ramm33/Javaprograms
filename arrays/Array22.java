package com.arrays;
import java.util.*;
public class Array22 {

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a number: ");
	        int a = sc.nextInt();

	        int s = a * a;
	        int i = a;
	        int c=0;
	        while (i > 0) {
	            int r = i% 10;
	            c++;
	            i = i / 10;
	        }
	        int div=(int)Math.pow(10, c);
	        if (s % div == a) {
	            System.out.println("Automorphic Number");
	        } else {
	            System.out.println("Not an Automorphic Number");
	        }
	    }
	}
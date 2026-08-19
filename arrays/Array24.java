package com.arrays;

import java.util.*;

public class Array24 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array size: ");
		int a =sc.nextInt();
		int[] arr=new int[a];
		System.out.println("Enter Array Elements:");
		
		for(int i=0;i<a;i++) {
			arr[i]=sc.nextInt();		
	}
		System.out.println("Array Elements:");
		for(int i=0;i<a;i++) {
			System.out.print(arr[i]+" ");
		}
		sc.close();
		
	}
	
}

	




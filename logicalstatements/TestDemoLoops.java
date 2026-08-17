package com.logicalstatements;
import java.util.Scanner;
public class TestDemoLoops {
    public static void main(String[] args) {
    	Scanner sc= new Scanner(System.in);
    	System.out.println("Enter the number");
    	int a = sc.nextInt();
        

        System.out.println("Multiplication Table of " );

        for (int i = 1; i <= a; i++) {
        	System.out.println("Table"+i);
        	for(int j=0;j<=10;j++) {
        		System.out.println(i+" x " + i + " = " + ( i* j));
        	}
        }
        sc.close();
    }
}
//Single Digit Or Not
package com.operators;
public class SingleDigit {
	    public static void main(String[] args) {
	        int num = 7;

	        String result = (num >= 0 && num <= 9)
	                ? "Single Digit Number"
	                : "Not a Single Digit";

	        System.out.println(result);
	    }
	}
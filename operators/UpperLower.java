package com.operators;

public class UpperLower {
	    public static void main(String[] args) {
	        char ch = 'M';

	        String result = (ch >= 'A' && ch <= 'Z')
	                ? "Uppercase Letter"
	                : "Lowercase Letter";

	        System.out.println(result);
	    }
	}
package com.operators;
public class VotingEligibilty {
	    public static void main(String[] args) {
	        int age = 20;

	        String result = (age >= 18) ? "Eligible to Vote" : "Not Eligible";

	        System.out.println("Age = " + age);
	        System.out.println(result);
	    }
	}
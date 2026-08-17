package com.operators;

//Java
//2.Assign a grade based on marks using nested ternary operators.
//Marks >= 90 → A
//Marks >= 75 → B
//Marks >= 60 → C
//Marks >= 40 → D
//Otherwise → Fail

public class TestDemotTernary {

	public static void main(String[] args) {
		int a = 30;
		String result = (a >= 90) ? "A" : (a >= 80) ? "B" : (a >= 60) ? "C" : (a >= 40) ? "D" : "fail";
		System.out.println(" the result:" + result);

	}

}

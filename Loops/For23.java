//Java-
//1.Find the Largest Digit in a Number
//Input : 983742
//Output : Largest Digit = 9 
package com.Loops;
import java.util.Scanner;
public class For23 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number:");
		int n= sc.nextInt();
		int largest=0;
		
		while(n>0) {
			int digit=n%10;
			if(digit>largest) {
				largest=digit;
			}
			n=n/10;
		}
		System.out.println("largest:"+largest);
	}

}

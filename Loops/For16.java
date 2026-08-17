package com.Loops;
import java.util.Scanner;
public class For16 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println(" Enter the Number");
		int n=sc.nextInt();
		
		for(int i=0;i<=n;i++) {
			if(isprime(i)) {
				System.out.print(i+" ");
				}
		}
	}
	static boolean isprime(int n) {
			boolean status=true;
			if(n==0||n==1) {
			
			}
	
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				status=false;
				break;
			}
		}
	
		return status;

	}

}


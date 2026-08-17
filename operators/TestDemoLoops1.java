package com.operators;
import java.util.Scanner;
public class TestDemoLoops1 {

	public static void main(String[] args) {
     Scanner sc= new Scanner(System.in);
     System.out.println("Enter a Number");
      int a =sc.nextInt();
      System.out.println("factors of a Number    :");
      
      for(int i=1;i<=a;i++) {
    	  if(a%i==0) {
    		  System.out.println(i+"");
    	  }
      }
      sc.close();
	}

}

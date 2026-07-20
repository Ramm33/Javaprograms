package com.javaintro;

public class cricketers {
	int jerseyNo;
	String cricketerName;
	int Age = 21;
	
	static int countryId = 25;
	static String countryName = "Australia";
	
	public static void main(String[] args) {
		System.out.println("Welcome to Aussies cricket Team");
		System.out.println("Object1 info**************");
		cricketers cummuins = new cricketers();
		cummuins.jerseyNo = 30;
		cummuins.cricketerName = "Patric James Cummuins";
		System.out.println("Coutry ID : " + countryId);
		System.out.println("Jersey Number : " +cummuins.jerseyNo);
		System.out.println("Name of the Cricketer : " + cummuins.cricketerName);
		System.out.println("Object2 info *********************");
		
		cricketers travis  = new cricketers();
		travis.jerseyNo = 50;
		travis.cricketerName = "travis head";
		System.out.println("Coutry ID : " + countryId);
		System.out.println("Country Name : " + countryName);
		System.out.println("Jersey Number : " + travis.jerseyNo);
		System.out.println("Name of the Cricketer : " + travis.cricketerName);
		System.out.println("Object3 info *********************");
		
		cricketers glen  = new cricketers();
		glen.jerseyNo = 70;
		glen.cricketerName = "glen maxewell";
		System.out.println("Coutry ID : " + countryId);
		System.out.println("Country Name : " + countryName);
		System.out.println("Jersey Number : " + glen.jerseyNo);
		System.out.println("Name of the Cricketer : " + glen.cricketerName);
		System.out.println("Object4 info *********************");
		
		cricketers josh  = new cricketers();
		josh.jerseyNo = 9;
		josh.cricketerName = "josh english";
		System.out.println("Coutry ID : " + countryId);
		System.out.println("Country Name : " + countryName);
		System.out.println("Jersey Number : " + josh.jerseyNo);
		System.out.println("Name of the Cricketer : " + josh.cricketerName);
		System.out.println("Object5 info *********************");





	}

}

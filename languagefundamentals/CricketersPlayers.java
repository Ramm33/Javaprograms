package com.languagefundamentals;

import java.util.Scanner;

public class CricketersPlayers {
	int jerseyNo;
	String PlayerName;
	int matchsplayed;
	double totalRuns;
	
	CricketersPlayers(int jerseyNo,String PlayerName,int matchsplayed,double totalRuns){
	    this.jerseyNo=jerseyNo;
		this.PlayerName=PlayerName;
		this.matchsplayed=matchsplayed;
		this.totalRuns=totalRuns;
	}
	void show() {
		double AverageRuns=(double)totalRuns/matchsplayed;
		System.out.println("\nPlayerDetails");
		System.out.println("jerseyNo:"+jerseyNo);
		System.out.println("PlayerName:"+PlayerName);
		System.out.println("totalRuns:"+totalRuns);
		System.out.println("AverageRuns:"+AverageRuns);
	}
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter JerseyNo :");
		int No = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter PlayerName:");
		String name=sc.nextLine();
		
		System.out.println("Enter matchsPlayed:");
		int matchs=sc.nextInt();	
		
		System.out.println("Enter totalRuns:");
		double TotalRuns=sc.nextDouble();
		
		CricketersPlayers player=new CricketersPlayers(No,name,matchs,TotalRuns);
		player.show();
		
		

	}

}

package com.javaintro;

import java.util.Scanner;

public class CricketersInfo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Team Name: ");
        String team = sc.nextLine();

        System.out.print("Enter Captain Name: ");
        String captain = sc.nextLine();

        System.out.print("Enter Coach Name: ");
        String coach = sc.nextLine();

        System.out.print("Enter Star Player: ");
        String player = sc.nextLine();

        System.out.print("Enter Stadium Name: ");
        String stadium = sc.nextLine();

        System.out.print("Enter Match Format (Test/ODI/T20): ");
        String format = sc.nextLine();

        System.out.print("Enter Total Runs: ");
        int runs = sc.nextInt();

        System.out.print("Enter Total Wickets: ");
        int wickets = sc.nextInt();

        // Display Output
        System.out.println("\n===== Cricket Information =====");
        System.out.println("Team Name      : " + team);
        System.out.println("Captain        : " + captain);
        System.out.println("Coach          : " + coach);
        System.out.println("Star Player    : " + player);
        System.out.println("Home Stadium   : " + stadium);
        System.out.println("Match Format   : " + format);
        System.out.println("Total Runs     : " + runs);
        System.out.println("Total Wickets  : " + wickets);

        sc.close();
    }
}
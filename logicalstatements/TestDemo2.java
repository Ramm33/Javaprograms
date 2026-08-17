package com.logicalstatements;

import java.util.Scanner;

public class TestDemo2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] items = {
                "Veg Biryani",
                "Chicken Biryani",
                "Fried Rice",
                "Noodles",
                "Pizza",
                "Burger",
                "Coffee",
                "Ice Cream"
        };

        int[] prices = {150, 220, 120, 100, 250, 80, 50, 70};
        int[] quantity = new int[8];

        int choice;
        char option;

        do {

            System.out.println("\n========= RESTAURANT MENU =========");
            for (int i = 0; i < items.length; i++) {
                System.out.println((i + 1) + ". " + items[i] + " - Rs." + prices[i]);
            }

            System.out.print("Enter Item Number (1-8): ");
            choice = sc.nextInt();

            if (choice >= 1 && choice <= 8) {
                System.out.print("Enter Quantity: ");
                quantity[choice - 1] += sc.nextInt();
                System.out.println(items[choice - 1] + " Added Successfully!");
            } else {
                System.out.println("Invalid Item Number!");
            }

            System.out.print("Do you want to order more? (Y/N): ");
            option = sc.next().charAt(0);

        } while (option == 'Y' || option == 'y');

        int subtotal = 0;

        System.out.println("\n========== BILL ==========");
        System.out.printf("%-20s %-10s %-10s %-10s\n", "Item", "Price", "Qty", "Amount");

        for (int i = 0; i < items.length; i++) {
            if (quantity[i] > 0) {
                int amount = prices[i] * quantity[i];
                subtotal += amount;

                System.out.printf("%-20s %-10d %-10d %-10d\n",
                        items[i], prices[i], quantity[i], amount);
            }
        }

        double gst = subtotal * 0.05;   // 5% GST
        double total = subtotal + gst;

        System.out.println("---------------------------------------------");
        System.out.println("Subtotal : Rs." + subtotal);
        System.out.println("GST (5%) : Rs." + gst);
        System.out.println("Total Bill : Rs." + total);
        System.out.println("---------------------------------------------");
        System.out.println("Thank You! Visit Again.");

        sc.close();
    }
}
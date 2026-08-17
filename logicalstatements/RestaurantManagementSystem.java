package com.logicalstatements;
import java.util.Scanner;

public class RestaurantManagementSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int choice;
        int qty;
        int totalBill = 0;

        do {
            System.out.println("\n========== RESTAURANT MENU ==========");
            System.out.println("1. Veg Biryani      - Rs.150");
            System.out.println("2. Chicken Biryani  - Rs.220");
            System.out.println("3. Fried Rice       - Rs.120");
            System.out.println("4. Noodles          - Rs.100");
            System.out.println("5. Burger           - Rs.80");
            System.out.println("6. Pizza            - Rs.250");
            System.out.println("7. Coffee           - Rs.50");
            System.out.println("8. Ice Cream        - Rs.70");
            System.out.println("9. Generate Bill & Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Quantity: ");
                    qty = sc.nextInt();
                    totalBill += qty * 150;
                    System.out.println("Veg Biryani Added!");
                    break;

                case 2:
                    System.out.print("Enter Quantity: ");
                    qty = sc.nextInt();
                    totalBill += qty * 220;
                    System.out.println("Chicken Biryani Added!");
                    break;

                case 3:
                    System.out.print("Enter Quantity: ");
                    qty = sc.nextInt();
                    totalBill += qty * 120;
                    System.out.println("Fried Rice Added!");
                    break;

                case 4:
                    System.out.print("Enter Quantity: ");
                    qty = sc.nextInt();
                    totalBill += qty * 100;
                    System.out.println("Noodles Added!");
                    break;

                case 5:
                    System.out.print("Enter Quantity: ");
                    qty = sc.nextInt();
                    totalBill += qty * 80;
                    System.out.println("Burger Added!");
                    break;

                case 6:
                    System.out.print("Enter Quantity: ");
                    qty = sc.nextInt();
                    totalBill += qty * 250;
                    System.out.println("Pizza Added!");
                    break;

                case 7:
                    System.out.print("Enter Quantity: ");
                    qty = sc.nextInt();
                    totalBill += qty * 50;
                    System.out.println("Coffee Added!");
                    break;

                case 8:
                    System.out.print("Enter Quantity: ");
                    qty = sc.nextInt();
                    totalBill += qty * 70;
                    System.out.println("Ice Cream Added!");
                    break;

                case 9:
                    System.out.println("\n========= FINAL BILL =========");
                    System.out.println("Total Amount = Rs." + totalBill);
                    System.out.println("Thank You! Visit Again.");
                    break;

                default:
                    System.out.println("Invalid Choice! Please Try Again.");
            }

        } while (choice != 9);

        sc.close();
    }
}


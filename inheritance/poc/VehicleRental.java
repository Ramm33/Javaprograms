package com.inheritance.poc;

import java.util.Scanner;

public class VehicleRental {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== VEHICLE RENTAL SYSTEM =====");

        System.out.println("1. Car");
        System.out.println("2. Bike");
        System.out.println("3. Truck");

        System.out.print("Enter vehicle type: ");
        int choice = sc.nextInt();

        System.out.print("Enter Vehicle ID: ");
        int id = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter Brand: ");
        String brand = sc.nextLine();

        System.out.print("Enter Model: ");
        String model = sc.nextLine();

        System.out.print("Enter Rent Per Day: ");
        double rent = sc.nextDouble();

        System.out.print("Enter Number of Days: ");
        int days = sc.nextInt();

        Vehicle vehicle;

        if (choice == 1) {
            vehicle = new Car();
        } 
        else if (choice == 2) {
            vehicle = new Bike();
        } 
        else if (choice == 3) {
            vehicle = new Truck();
        } 
        else {
            System.out.println("Invalid choice!");
            sc.close();
            return;
        }

        // Setting data using setters
        vehicle.setVehicleId(id);
        vehicle.setBrand(brand);
        vehicle.setModel(model);
        vehicle.setRentPerDay(rent);

        System.out.println("\n===== VEHICLE DETAILS =====");

        vehicle.displayVehicle();

        System.out.println("Number of Days : " + days);
        System.out.println("Total Rent     : " 
                           + vehicle.calculateRent(days));

        sc.close();
    }
}
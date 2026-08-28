package com.inheritance;
import java.util.*;
public class VehicleRental {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== VEHICLE RENTAL SYSTEM =====");

        System.out.println("1. Car");
        System.out.println("2. Bike");
        System.out.println("3. Truck");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        System.out.print("Enter Vehicle ID: ");
        int vehicleId = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter Brand: ");
        String brand = sc.nextLine();

        System.out.print("Enter Model: ");
        String model = sc.nextLine();

        System.out.print("Enter Rent Per Day: ");
        double rentPerDay = sc.nextDouble();

        System.out.print("Enter Number of Days: ");
        int days = sc.nextInt();

        Vehicle vehicle;

        if (choice == 1) {

            vehicle = new Car(vehicleId, brand, model, rentPerDay);

        } else if (choice == 2) {

            vehicle = new Bike(vehicleId, brand, model, rentPerDay);

        } else if (choice == 3) {

            vehicle = new Truck(vehicleId, brand, model, rentPerDay);

        } else {

            System.out.println("Invalid Choice!");
            sc.close();
            return;
        }

        System.out.println();
        System.out.println("===== VEHICLE DETAILS =====");

        vehicle.displayDetails();

        System.out.println();
        vehicle.calculateRent(days);

        sc.close();
    }
}
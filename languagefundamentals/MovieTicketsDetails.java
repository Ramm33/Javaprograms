package com.languagefundamentals;

public class MovieTicketsDetails {

    public static void main(String[] args) {

        int ticketId = 1001;
        int screenNumber = 5;
        double ticketPrice = 250.00;
        boolean onlineBookingStatus = true;
        byte viewerAge = 22;
        int numberOfTickets = 3;
        long contactNumber = 9876543210L;
        double gstAmount = 45.00;

        System.out.println("========= MOVIE TICKET DETAILS =========");
        System.out.println("Ticket ID             : " + ticketId);
        System.out.println("Screen Number         : " + screenNumber);
        System.out.println("Ticket Price          : ₹" + ticketPrice);
        System.out.println("Online Booking Status : " + onlineBookingStatus);
        System.out.println("Viewer Age            : " + viewerAge);
        System.out.println("Number of Tickets     : " + numberOfTickets);
        System.out.println("Contact Number        : " + contactNumber);
        System.out.println("GST Amount            : ₹" + gstAmount);
        System.out.println("========================================");
    }
}
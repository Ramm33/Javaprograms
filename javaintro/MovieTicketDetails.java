package com.javaintro;

public class MovieTicketDetails {

    int ticketId = 1001;
    int screenNumber = 5;
    double ticketPrice = 250.00;
    boolean onlineBookingStatus = true;
    int viewerAge = 22;
    int numberOfTickets = 3;
    long contactNumber = 9876543210L;
    double gstAmount = 45.00;

    public static void main(String[] args) {

        // Object creation
        MovieTicketDetails movie = new MovieTicketDetails();

        // Display Movie Ticket Details
        System.out.println("----- Movie Ticket Details -----");
        System.out.println("Ticket ID             : " + movie.ticketId);
        System.out.println("Screen Number         : " + movie.screenNumber);
        System.out.println("Ticket Price          : ₹" + movie.ticketPrice);
        System.out.println("Online Booking Status : " + movie.onlineBookingStatus);
        System.out.println("Viewer Age            : " + movie.viewerAge);
        System.out.println("Number of Tickets     : " + movie.numberOfTickets);
        System.out.println("Contact Number        : " + movie.contactNumber);
        System.out.println("GST Amount            : ₹" + movie.gstAmount);
    }
}
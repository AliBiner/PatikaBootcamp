package com.alibiner.Week3.FlightTicket;


public class Main {
    public static void main(String[] args) {
        Passenger passenger = new Passenger();
        Flight flight = new Flight(0.10f);
        FlightTicket flightTicket = new FlightTicket(passenger,flight);
        System.out.println(flightTicket.calcTotalPrice());
    }
}

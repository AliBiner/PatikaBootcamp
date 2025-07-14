package com.alibiner.Week3.FlightTicket;

import java.util.Scanner;

public class FlightTicket {
    // Flight ticket has a passenger and a flight
    private Passenger passenger;
    private Flight flight;
    private FlightDirection flightDirection;

    // Constructor - create ticket with passenger and flight info
    public FlightTicket(Passenger passenger, Flight flight) {
        this.passenger = passenger;
        this.flight = flight;

        // Create Scanner to get input from user
        Scanner scanner = new Scanner(System.in);
        byte inputFlightDirection = 0;

        // Ask user to enter trip type until valid value (1 or 2)
        do {
            System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): ");
            inputFlightDirection = scanner.nextByte();
        }while (inputFlightDirection<1 || inputFlightDirection>2);

        // Set flight direction based on user input
        if (inputFlightDirection==1)
            this.flightDirection = FlightDirection.TEK_YON;
        else
            this.flightDirection = FlightDirection.GIDIS_DONUS;
    }

    // Calculate discount based on passenger's age
    private float calculateDiscountForAge(){
        float discount = 0.00f;

        // If passenger is under 12 years old, give 50% discount
        if (passenger.getAge() < 12 && passenger.getAge() > 0)
            discount = flight.calcFlightPrice() * 0.50f;

        // If passenger is between 12 and 24, give 10% discount
        else if (passenger.getAge()>=12 && passenger.getAge()<=24)
            discount = flight.calcFlightPrice() * 0.10f;

        // If passenger is 65 or older, give 30% discount
        else if (passenger.getAge()>=65)
            discount = flight.calcFlightPrice() * 0.30f;

        return discount;
    }

    // Calculate the final total price with age and trip discounts
    public String calcTotalPrice() {
        // Step 1: Subtract age discount from base flight price
        float reducedPrice = flight.calcFlightPrice() - calculateDiscountForAge();

        // If trip is one way, just return reduced price
        if (flightDirection.equals(FlightDirection.TEK_YON))
           return "Toplam Tutar = " + reducedPrice + " TL";
        else {
            // Step 2: If round trip, apply additional 20% discount
            float discountForFlightDirection = reducedPrice * 0.20f;
            reducedPrice -= discountForFlightDirection;

            // Step 3: Multiply by 2 because it's round trip
            reducedPrice *= 2; // Round-trip flight ticket price
            return "Toplam Tutar = " + reducedPrice + " TL";
        }
    }
}

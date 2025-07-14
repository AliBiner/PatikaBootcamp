package com.alibiner.Week3.FlightTicket;

import java.util.Scanner;

public class Flight {
    // Distance of the flight in kilometers
    private float distance;

    // Price per kilometer (TL per km)
    private final float pricePerKm;

    // Constructor - gets distance from user and sets price per km
    public Flight( float pricePerKm) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter a positive distance (in kilometers)
        do {
            System.out.print("Mesafeyi km türünde (pozitif değer) giriniz: ");
            this.distance = scanner.nextFloat();
        }while (distance<=0f); // Repeat if distance is 0 or negative

        // Set price per kilometer
        this.pricePerKm = pricePerKm;
    }

    // Getter - return the flight distance
    public float getDistance() {
        return distance;
    }

    // Getter - return the price per kilometer
    public float getPricePerKm() {
        return pricePerKm;
    }

    // Calculate total flight price (distance × price per km)
    public float calcFlightPrice(){
        return distance * pricePerKm;
    }
}

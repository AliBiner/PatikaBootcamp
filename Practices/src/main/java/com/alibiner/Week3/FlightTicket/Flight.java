package com.alibiner.Week3.FlightTicket;

import java.util.Scanner;

public class Flight {
    // Distance of the flight in kilometers
    private float distance;

    // Price per kilometer (TL per km)
    private final float PRICE_PER_KM;

    // Constructor - gets distance from user and sets price per km
    public Flight( float PRICE_PER_KM) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter a positive distance (in kilometers)
        do {
            System.out.print("Mesafeyi km türünde (pozitif değer) giriniz: ");
            this.distance = scanner.nextFloat();
        }while (distance<=0f); // Repeat if distance is 0 or negative

        // Set price per kilometer
        this.PRICE_PER_KM = PRICE_PER_KM;
    }

    // Getter - return the flight distance
    public float getDistance() {
        return distance;
    }

    // Getter - return the price per kilometer
    public float getPRICE_PER_KM() {
        return PRICE_PER_KM;
    }

    // Calculate total flight price (distance × price per km)
    public float calcFlightPrice(){
        return distance * PRICE_PER_KM;
    }
}

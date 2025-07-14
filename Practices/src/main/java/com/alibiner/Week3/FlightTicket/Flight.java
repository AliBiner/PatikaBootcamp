package com.alibiner.Week3.FlightTicket;

import java.util.Scanner;

public class Flight {
    private float distance;
    private final float pricePerKm;

    public Flight( float pricePerKm) {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Mesafeyi km türünde (pozitif değer) giriniz: ");
            this.distance = scanner.nextFloat();
        }while (distance<=0f);
        this.pricePerKm = pricePerKm;
    }

    public float getDistance() {
        return distance;
    }

    public float getPricePerKm() {
        return pricePerKm;
    }

    public float calcFlightPrice(){
        return distance * pricePerKm;
    }
}

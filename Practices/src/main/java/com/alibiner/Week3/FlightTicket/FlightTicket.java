package com.alibiner.Week3.FlightTicket;

import java.util.Scanner;

public class FlightTicket {
    private Passenger passenger;
    private Flight flight;
    private FlightDirection flightDirection;

    public FlightTicket(Passenger passenger, Flight flight) {
        this.passenger = passenger;
        this.flight = flight;
        Scanner scanner = new Scanner(System.in);
        byte inputFlightDirection = 0;
        do {
            System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): ");
            inputFlightDirection = scanner.nextByte();
        }while (inputFlightDirection<1 || inputFlightDirection>2);
        if (inputFlightDirection==1)
            this.flightDirection = FlightDirection.TEK_YON;
        else
            this.flightDirection = FlightDirection.GIDIS_DONUS;
    }

    private float calculateDiscountForAge(){
        float discount = 0.00f;
        if (passenger.getAge() < 12 && passenger.getAge() > 0)
            discount = flight.calcFlightPrice() * 0.50f;
        else if (passenger.getAge()>=12 && passenger.getAge()<=24)
            discount = flight.calcFlightPrice() * 0.10f;
        else if (passenger.getAge()>=65)
            discount = flight.calcFlightPrice() * 0.30f;
        return discount;
    }

    public String calcTotalPrice() {
        float reducedPrice = flight.calcFlightPrice() - calculateDiscountForAge();
        if (flightDirection.equals(FlightDirection.TEK_YON))
           return "Toplam Tutar = " + reducedPrice + " TL";
        else {
            float discountForFlightDirection = reducedPrice * 0.20f;
            reducedPrice -= discountForFlightDirection;
            reducedPrice *= 2; // Round-trip flight ticket price
            return "Toplam Tutar = " + reducedPrice + " TL";
        }
    }







}

package com.alibiner.Week3.FlightTicket;

import java.util.Scanner;

public class Passenger {
    // Passenger's age (default = 0)
    private byte age = 0;

    // Constructor - ask the user to enter age when object is created
    public Passenger() {
        Scanner scanner = new Scanner(System.in);

        // Ask user until they enter a positive age
        do {
            System.out.print("Yaşınızı (pozitif değer) giriniz : ");
            this.age = scanner.nextByte();
        }while (this.age<=0); // Repeat if input is 0 or less
    }

    // Getter - return passenger's age
    public byte getAge() {
        if (age == 0) {
            // If age is not set correctly, show warning
            System.out.println("Yolcunun yaşı tanımlanmamıştır."); // "Passenger's age is not defined."
            return age;
        }
        else
            return age;
    }

    // Setter - set age from outside (if needed)
    public void setAge(byte age) {
        if (age<1)
            // Show error if age is less than 1
            System.out.println("Yolcunun yaşı 1'den küçük olamaz. ");
        else
            this.age = age;
    }
}

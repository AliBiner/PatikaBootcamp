package com.alibiner.Week3.FlightTicket;

import java.util.Scanner;

public class Passenger {
    private byte age = 0;

    public Passenger() {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Yaşınızı (pozitif değer) giriniz : ");
            this.age = scanner.nextByte();
        }while (this.age<=0);
    }

    public byte getAge() {
        if (age == 0) {
            System.out.println("Yolcunun yaşı tanımlanmamıştır.");
            return age;
        }
        else
            return age;
    }

    public void setAge(byte age) {
        if (age<1)
            System.out.println("Yolcunun yaşı 1'den küçük olamaz. ");
        else
            this.age = age;
    }
}

package com.alibiner.Week3.LeapYear;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create a Scanner object to read data from console
        Scanner scanner = new Scanner(System.in);

        // Ask user to enter a year
        System.out.print("Yıl giriniz : ");
        int year = scanner.nextInt(); // Read year as integer

        // Check if the year is divisible by 4
        if (year % 4 == 0){
            // If year is divisible by 400, it is a leap year
            if (year % 400 == 0)
                System.out.println(year +  " Artık yıldır.");

            // If year is divisible by 100 but not by 400, it's not a leap year
            else if (year % 100 ==0)
                System.out.println(year + " Artık yıl değildir.");

            // If year is divisible by 4 but not by 100, it's a leap year
            else
                System.out.println(year + " Artık yıldır.");
        }
        // If year is not divisible by 4, it's not a leap year
        else
            System.out.println(year + " Artık yıl değildir.");
    }
}


package com.alibiner.Week3.ChineseHoroscope;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create a Scanner object to get input from user
        Scanner scanner = new Scanner(System.in);

        // Ask user to enter their birth year
        System.out.print("Doğum yılınızı giriniz : ");
        int birthYear = scanner.nextInt();

        // Calculate the remainder when birth year is divided by 12
        byte mod = (byte) (birthYear % 12);

        // Define an empty string for the Chinese horoscope
        String horoscope = "";

        // Find the horoscope animal according to the remainder
        switch (mod){
            case 0 :
                horoscope = "Maymun";
                break;
            case 1 :
                horoscope = "Horoz";
                break;
            case 2 :
                horoscope = "Köpek";
                break;
            case 3 :
                horoscope = "Domuz";
                break;
            case 4 :
                horoscope = "Fare";
                break;
            case 5 :
                horoscope = "Öküz";
                break;
            case 6 :
                horoscope = "Kaplan";
                break;
            case 7 :
                horoscope = "Tavşan";
                break;
            case 8 :
                horoscope = "Ejderha";
                break;
            case 9 :
                horoscope = "Yılan";
                break;
            case 10 :
                horoscope = "At";
                break;
            case 11:
                horoscope = "Koyun";
                break;
            default:
                break;

        }

        // Print the horoscope animal name
        System.out.println("Çin Zodyağı Burcunuz : " + horoscope);

    }
}

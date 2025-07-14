package com.alibiner.Week3.BMICalculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create Scanner Object for take values from user
        Scanner scanner = new Scanner(System.in);

        // Take user height (m)
        System.out.print("Boyunuzu(m) giriniz: ");
        double height = scanner.nextDouble();

        // Take user weight (kg)
        System.out.print("Kilonuzu(kg) giriniz: ");
        double weight = scanner.nextDouble();

        // Calculate bmi by formula
        double bmi = weight / ( height * height);

        // Output
        System.out.println("Vücut kitle indeksiniz: " + bmi);
    }
}

package com.alibiner.Week3.ArithmeticOperationsAndPriority;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create Scanner Object for take input from user
        Scanner scanner = new Scanner(System.in);

        // Take 3 numbers for user (a,b,c)
        System.out.print("1. Sayıyı giriniz: ");
        int a = scanner.nextInt();
        System.out.print("2. Sayıyı giriniz: ");
        int b = scanner.nextInt();
        System.out.print("3. Sayıyı giriniz: ");
        int c = scanner.nextInt();

        // calculate result by operation priority
        int result = a + b * c - b;

        // Output result
        System.out.println("Sonuç: " + result);

        // Close scanner
        scanner.close();
    }
}

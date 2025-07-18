package com.alibiner.Week4.NumberRounding;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ondalıklı bir sayı giriniz: ");
        double inputValue = scanner.nextDouble();

        double floorValue = Math.floor(inputValue);
        double ceilValue = Math.ceil(inputValue);
        double roundedValue = Math.round(inputValue);

        System.out.println("Aşağı Yuvarlama: " + (long) floorValue);
        System.out.println("Yukarı Yuvarlama: " + (long) ceilValue);
        System.out.println("En Yakın Tam Sayı: " + (long) roundedValue);
    }
}

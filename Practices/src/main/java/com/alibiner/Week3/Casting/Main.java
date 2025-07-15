package com.alibiner.Week3.Casting;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Tam sayı giriniz: ");
        int integerNumber = scanner.nextInt();

        System.out.print("Ondalıklı sayı giriniz: ");
        float floatNumber = scanner.nextFloat();

        float integerToFloat = (float) integerNumber;
        System.out.println(integerNumber + " tam sayısının ondalıklı sayıya dönüşümü: " + integerToFloat );

        int floatToInteger = (int) floatNumber;
        System.out.println(floatNumber + " ondalıklı sayısının tam sayıya dönüşümü: " + floatToInteger);
    }
}

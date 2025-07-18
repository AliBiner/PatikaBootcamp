package com.alibiner.Week4.PowerOfNumberWithRecursive;

import java.util.Scanner;

public class PowersOfNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Taban değerini giriniz: ");
        int number = scanner.nextInt();
        System.out.print("Üs değerini giriniz: ");
        int power = scanner.nextInt();


        System.out.println("Sonuç: " + pow(number,power));
    }

    public static int pow(int number, int power){
        if (power==0)
            return 1;
        return number * (pow(number,power-1));
    }
}

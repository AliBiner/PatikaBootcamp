package com.alibiner.Week3.FindMinMax;

import java.util.Scanner;

public class FindMinMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kaç sayı girilecek: ");
        int length = scanner.nextInt();

        int min = 0;
        int max = 0;
        for (int i = 0; i < length; i++) {
            System.out.print( i+1 + ". sayıyı giriniz: ");
            int input = scanner.nextInt();
            if (i==0){
                min = input;
                max = input;
            }
            else {
                if (input > max){
                    max = input;
                } else if (input<min) {
                    min = input;
                }
            }
        }
        System.out.println("En Küçük Sayı: " + min);
        System.out.println("En Büyük Sayı: " + max);

    }
}

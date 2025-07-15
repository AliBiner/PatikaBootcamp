package com.alibiner.Week3.DrawInvertedTriangle;

import java.util.Scanner;

public class DrawInvertedTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int range = scanner.nextInt();

        for (int i = 0; i < range; i++) {
            for (int j = (range-i)*2-1; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

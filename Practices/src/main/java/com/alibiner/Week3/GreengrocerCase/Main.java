package com.alibiner.Week3.GreengrocerCase;

public class Main {
    public static void main(String[] args) {
        GreengrocerCase greengrocerCase = new GreengrocerCase();
        greengrocerCase.collectWeightsFromUser();
        float totalPrice = greengrocerCase.calculateTotalPrice();
        System.out.println("Toplam Tutar : "+ totalPrice + " TL");
    }
}

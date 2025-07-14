package com.alibiner.Week3.GreengrocerCase;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GreengrocerCase {
    private final List<Product> products = new ArrayList<>();

    public GreengrocerCase() {
        products.add(new Product("Armut",2.14f));
        products.add(new Product("Elma",3.67f));
        products.add(new Product("Domates",1.11f));
        products.add(new Product("Muz",0.95f));
        products.add(new Product("Patlıcan",5.00f));
    }

    public void collectWeightsFromUser(){
        Scanner scanner = new Scanner(System.in);

        for (Product product : products){
            System.out.print( product.getName() + " Kaç Kilo ? : ");
            float weight = scanner.nextFloat();
            product.setWeight(weight);
        }
    }

    public float calculateTotalPrice(){
        float total = 0;
        for (Product product : products){
            total += product.calculateTotal();
        }
        return total;
    }

}

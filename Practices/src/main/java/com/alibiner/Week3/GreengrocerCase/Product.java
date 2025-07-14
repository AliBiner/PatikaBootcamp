package com.alibiner.Week3.GreengrocerCase;


public class Product {
    private final String name;
    private final float pricePerKg;
    private float weight;

    public Product(String name, float pricePerKg) {
        this.name = name;
        this.pricePerKg = pricePerKg;
        this.weight=0f;
    }

    public String getName() {
        return name;
    }

    public float getPricePerKg() {
        return pricePerKg;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public  float calculateTotal(){
        return pricePerKg * weight;
    }
}

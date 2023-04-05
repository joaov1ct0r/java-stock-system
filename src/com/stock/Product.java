package com.stock;

public class Product {
    private final String name;
    private final String brand;
    private int units;
    private double price;

    public Product(String name, String brand, int units, double price) {
        this.name = name;
        this.brand = brand;
        this.units = units;
        this.price = price;
    }

    protected String getName() {
        return this.name;
    }

    protected String getBrand() {
        return this.brand;
    }

    protected int getUnits() {
        return this.units;
    }

    protected void setUnits(int units) {
        this.units = units;
    }

    protected double getPrice() {
        return this.price;
    }

    protected void setPrice(double price) {
        this.price = price;
    }
}

package com.stock;

public class Main {
    public static void main(String[] args) {
        Stock stock = new Stock();
        Stockist stockist = new Stockist("Tony Stark", stock);
        System.out.println("Hello Welcome to stock of " + stockist.getNome());
        stockist.helloWorld();
    }
}
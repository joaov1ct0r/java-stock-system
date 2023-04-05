package com.stock;

import java.util.ArrayList;
import java.util.Scanner;

public class Stockist {
    private final String name;
    private final Stock stock;
    private final Scanner scanner;

    public Stockist(String name, Stock stock) {
        this.name = name;
        this.stock = stock;
        this.scanner = new Scanner(System.in);
    }

    private void listProduct() {
        System.out.println("***** *****");
        System.out.println("ENTER THE PRODUCT NAME: ");
        System.out.println("***** *****");

        String product = this.scanner.nextLine();

        Product prod = this.stock.getProduct(product);

        System.out.println("***** *****");
        if (prod == null) {
            System.out.println("PRODUCT NOT FOUND");
        } else {
            System.out.println("PRODUCT FOUND: ");
            System.out.println("NAME: " + prod.getName());
            System.out.println("BRAND: " + prod.getBrand());
            System.out.println("UNITS: " + prod.getUnits());
            System.out.println("PRICE " + prod.getPrice());
        }
        System.out.println("***** *****");

        this.helloWorld();
    }

    private void listProducts() {
        System.out.println("***** *****");
        ArrayList<Product> products = this.stock.getProducts();
        for (Product product : products) {
            System.out.println("--------------------------");
            System.out.println(
                    "BRAND: "
                            + product.getBrand()
                            + " | "
                            + "NAME: "
                            + product.getName()
                            + " | "
                            + "PRICE: "
                            + product.getPrice()
                            + " | "
                            + "UNITS: "
                            + product.getUnits());
            System.out.println("--------------------------");
        }
        System.out.println("***** *****");

        this.helloWorld();
    }

    private void addProduct() {
        System.out.println("***** *****");
        System.out.println("ENTER THE PRODUCT NAME: ");
        System.out.println("***** *****");

        String productName = this.scanner.nextLine();

        System.out.println("***** *****");
        System.out.println("ENTER THE PRODUCT BRAND: ");
        System.out.println("***** *****");

        String productBrand = this.scanner.nextLine();

        System.out.println("***** *****");
        System.out.println("ENTER THE QUANTITY OF PRODUCT UNITS: ");
        System.out.println("***** *****");

        int productUnits = this.scanner.nextInt();
        this.scanner.nextLine();

        System.out.println("***** *****");
        System.out.println("ENTER THE PRODUCT PRICE: ");
        System.out.println("***** *****");

        double productPrice = this.scanner.nextDouble();
        this.scanner.nextLine();

        Product product = new Product(productName, productBrand, productUnits, productPrice);

        this.stock.addProduct(product);

        System.out.println("***** *****");
        System.out.println("REGISTERED PRODUCT");
        System.out.println("***** *****");
        this.helloWorld();
    }

    private void editProductPrice() {
        System.out.println("***** *****");
        System.out.println("ENTER THE PRODUCT NAME: ");
        System.out.println("***** *****");

        String prod = this.scanner.nextLine();
        Product product = this.stock.getProduct(prod);

        System.out.println("***** *****");

        if (product == null) {
            System.out.println("PRODUCT NOT FOUND");
        } else {
            System.out.println("***** *****");
            System.out.println("ENTER THE NEW PRODUCT PRICE: ");
            System.out.println("***** *****");

            double price = this.scanner.nextDouble();
            this.scanner.nextLine();
            product.setPrice(price);

            System.out.println("PRODUCT PRICE UPDATED SUCCESSFULLY!");
        }
        System.out.println("***** *****");

        this.helloWorld();
    }

    private void editProductUnit() {
        System.out.println("***** *****");
        System.out.println("ENTER THE PRODUCT NAME: ");
        System.out.println("***** *****");

        String prod = this.scanner.nextLine();
        Product product = this.stock.getProduct(prod);

        System.out.println("***** *****");

        if (product == null) {
            System.out.println("PRODUCT NOT FOUND");
        } else {
            System.out.println("***** *****");
            System.out.println("ENTER THE NEW PRODUCT UNITS: ");
            System.out.println("***** *****");

            int units = this.scanner.nextInt();
            this.scanner.nextLine();
            product.setUnits(units);

            System.out.println("PRODUCT UNITS UPDATED SUCCESSFULLY!");
        }
        System.out.println("***** *****");

        this.helloWorld();
    }

    private void deleteProduct() {
        System.out.println("***** *****");
        System.out.println("ENTER THE PRODUCT NAME: ");
        System.out.println("***** *****");

        String prod = this.scanner.nextLine();
        Product product = this.stock.getProduct(prod);

        System.out.println("***** *****");

        if (product == null) {
            System.out.println("PRODUCT NOT FOUND");
        } else {
            this.stock.deleteProduct(product);

            System.out.println("PRODUCT DELETED SUCCESSFULLY!");
        }
        System.out.println("***** *****");

        this.helloWorld();
    }

    public void helloWorld() {
        System.out.println("***** *****");
        System.out.println("CHOOSE THE OPTION YOU WANT TO FOLLOW: ");
        System.out.println("1: REGISTER NEW PRODUCT");
        System.out.println("2: LIST REGISTERED PRODUCTS");
        System.out.println("3: LIST SPECIFIC PRODUCT");
        System.out.println("4: EDIT PRODUCT PRICE");
        System.out.println("5: EDIT PRODUCT UNITS");
        System.out.println("6: DELETE PRODUCT");
        System.out.println("7: EXIT");
        System.out.println("***** *****");

        int option = this.scanner.nextInt();
        this.scanner.nextLine();

        switch(option) {
            case 1 -> this.addProduct();
            case 2 -> this.listProducts();
            case 3 -> this.listProduct();
            case 4 -> this.editProductPrice();
            case 5 -> this.editProductUnit();
            case 6 -> this.deleteProduct();
            case 7 -> System.exit(1);
        }
    }
    public String getNome() {
        return this.name;
    }
}

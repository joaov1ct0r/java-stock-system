package com.stock;

import java.util.ArrayList;
import java.util.Optional;

public class Stock {
    private final ArrayList<Product> products;

    public Stock() {
        this.products = new ArrayList<Product>();
    }

    protected Product getProduct(String prod) {
        Optional<Product> product = this.products.stream()
                .filter(b -> b.getName().equals(prod))
                .findFirst();

        if (product.isEmpty()) {
            return null;
        } else {
            return product.get();
        }
    }

    protected void deleteProduct(Product prod) {
        int prodIndex = this.products.indexOf(prod);
        this.products.remove(prodIndex);
    }

    protected ArrayList<Product> getProducts() {
        return this.products;
    }

    protected void addProduct(Product prod) {
        this.products.add(prod);
    }
}

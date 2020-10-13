package de.talran.data;

import java.util.Arrays;

public class Category {
    private String name;
    Product[] products;

    public Category(String name, Product[] products) {
        this.name = name;
        this.products = products;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Category: " + name +
                ", products: " + Arrays.toString(products);
    }
}

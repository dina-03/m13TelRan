package de.talran.data;

public class Basket {
    private Basket[] baskets;
    private int size;
    private Product[] products;

    public Basket(int capacity) {
        products = new  Product[capacity];
    }
}

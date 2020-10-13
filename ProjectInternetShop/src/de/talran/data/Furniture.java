package de.talran.data;

public class Furniture extends Category{
    private int ID;

    public Furniture(String name, Product[] products, int ID) {
        super(name, products);
        this.ID = ID;
    }
}

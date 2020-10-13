package de.talran.data;

public class Technic extends Category{
    private int ID;

    public Technic(String name, Product[] products, int ID) {
        super(name, products);
        this.ID = ID;
    }
}

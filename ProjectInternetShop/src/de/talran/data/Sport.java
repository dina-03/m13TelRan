package de.talran.data;

public class Sport extends Category{
    private int ID;

    public Sport(String name, Product[] products, int ID) {
        super(name, products);
        this.ID = ID;
    }
}

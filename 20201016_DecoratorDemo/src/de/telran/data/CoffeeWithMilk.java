package de.telran.data;

public class CoffeeWithMilk extends Coffee{
    private final static int MILK_PRICE = 10;

    @Override
    public int getPrice() {
        return super.getPrice() + MILK_PRICE;
    }
}

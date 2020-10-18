package de.telran.decorator;

public class CoffeeImpl implements Coffee{
    private final static int BASIC_COFFEE_PRICE = 50;

    @Override
    public int getPrice() {
        System.out.println("Price for basic coffee " + BASIC_COFFEE_PRICE);
        return BASIC_COFFEE_PRICE;
    }
}

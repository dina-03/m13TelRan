package de.telran.data;

public class PizzaImpl implements Pizza{
    private final static int BASIC_PIZZA_PRICE = 500;

    @Override
    public int getPrice() {
        System.out.println("price for basic pizza " + BASIC_PIZZA_PRICE);
        return BASIC_PIZZA_PRICE;
    }
}

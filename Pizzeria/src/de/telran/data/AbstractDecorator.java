package de.telran.data;

public abstract class AbstractDecorator implements Pizza{
    private Pizza pizza;

    public AbstractDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public int getPrice() {
        return pizza.getPrice();
    }
}

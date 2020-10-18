package de.telran.data;

public class PizzaHam extends AbstractDecorator{
    private final static int HAM_PRICE = 50;

    public PizzaHam(Pizza pizza) {
        super(pizza);
    }

    @Override
    public int getPrice() {
        int price = super.getPrice() + HAM_PRICE;
        System.out.println("price with ham " + price);
        return price;
    }
}

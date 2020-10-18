package de.telran.data;

public class PizzaPaprika extends AbstractDecorator{
    private final static int PAPRIKA_PRICE = 30;

    public PizzaPaprika(Pizza pizza) {
        super(pizza);
    }

    @Override
    public int getPrice() {
        int price = super.getPrice() + PAPRIKA_PRICE;
        System.out.println("price with paprika " + price);
        return price;
    }
}

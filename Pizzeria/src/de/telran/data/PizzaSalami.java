package de.telran.data;

public class PizzaSalami extends AbstractDecorator{
    private final static int SALAMI_PRICE = 40;

    public PizzaSalami(Pizza pizza) {
        super(pizza);
    }

    @Override
    public int getPrice() {
        int price = super.getPrice() + SALAMI_PRICE;
        System.out.println("price with salami " + price);
        return price;
    }
}

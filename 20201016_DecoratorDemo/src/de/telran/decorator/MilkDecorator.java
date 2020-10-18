package de.telran.decorator;

public class MilkDecorator extends AbstractDecorator {
    private final static int MILK_PRICE = 10;

    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public int getPrice() {
        int price = super.getPrice() + MILK_PRICE;
        System.out.println("price with milk " + price);
        return price;
    }
}

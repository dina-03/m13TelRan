package de.talran.data;

import java.util.Objects;

public class Product {
    private String name;
    private double price;
    private int ranking;

    public Product(String name, double price, int ranking) {
        this.name = name;
        this.price = price;
        this.ranking = ranking;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getRanking() {
        return ranking;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Product product = (Product) o;
        return Double.compare(product.price, price) == 0 &&
                ranking == product.ranking &&
                name.equals(product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, ranking);
    }

    @Override
    public String toString() {
        return name + ", price: " + price + "€" +
                ", ranking: " + ranking;
    }
}

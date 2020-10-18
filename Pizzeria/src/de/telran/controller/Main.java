package de.telran.controller;

import de.telran.data.*;

public class Main {
    public static void main(String[] args) {
        Pizza pizza = new PizzaImpl();
        Pizza pizzaWithSalami = new PizzaSalami(pizza);
        Pizza pizzaWithHam = new PizzaHam(pizza);
        Pizza pizzaWithSalamiAndPaprika = new PizzaSalami(new PizzaPaprika(new PizzaImpl()));
        Pizza pizzaWithHamAndPaprika = new PizzaHam(new PizzaPaprika(new PizzaImpl()));

        pizza.getPrice();
        System.out.println();
        System.out.println(pizzaWithSalami.getPrice());
        System.out.println();
        System.out.println(pizzaWithHam.getPrice());
        System.out.println();
        pizzaWithHamAndPaprika.getPrice();
        System.out.println();
        pizzaWithSalamiAndPaprika.getPrice();
    }
}

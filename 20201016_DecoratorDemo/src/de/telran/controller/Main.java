package de.telran.controller;

import de.telran.decorator.Coffee;
import de.telran.decorator.CoffeeImpl;
import de.telran.decorator.MilkDecorator;
import de.telran.decorator.SugarDecorator;

public class Main {
    public static void main(String[] args) {
        Coffee coffee = new CoffeeImpl();
        Coffee coffeeWithMilk = new MilkDecorator(coffee);
        Coffee coffeeWithSugar = new SugarDecorator(coffee);
        Coffee coffeeWithMilkAndSugar = new MilkDecorator(new SugarDecorator(new CoffeeImpl()));
        //System.out.println(coffee.getPrice());
        coffee.getPrice();
        System.out.println();
        System.out.println(coffeeWithMilk.getPrice());
        System.out.println();
        System.out.println(coffeeWithSugar.getPrice());
        System.out.println();
        coffeeWithMilkAndSugar.getPrice();
    }
}

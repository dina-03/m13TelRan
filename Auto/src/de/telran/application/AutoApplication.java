package de.telran.application;

import de.telran.data.Auto;

public class AutoApplication {
    public static void main(String[] args) {
        Auto auto1 = new Auto("Audi", 2002, "Sedan","A4",4,"Germany");
        Auto auto2 = new Auto("BMW", 2019, "Off-Road/Pick-up","80KWH",5,"Germany");
        auto1.setPrice(1000);
        auto1.setBodyColor("Black");
        auto2.setPrice(64000);
        auto2.setBodyColor("Grey");
        System.out.println(auto1);
        System.out.println(auto2);
    }
}

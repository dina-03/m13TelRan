package de.telran;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Auto auto1 = new Auto("Audi", 2010, 96000);
        Auto auto2 = new Auto("BMW", 2018, 96000);
        Auto auto3 = new Auto("Jeep Grand", 2020, 35000);
        Auto auto4 = new Auto("Mercedes-Benz", 2019, 26000);
        Auto auto5 = new Auto("Volkswagen", 2010, 60000);

        Auto[] autosGroup = {auto1, auto2, auto3, auto4, auto5};
        auto1.compareAutoByMileage(autosGroup);
        System.out.println("---------------");

        Comparator<Auto> autoComparator = new AutoComparatorByYearAndMileage();

        int comparison = autoComparator.compare(auto1, auto2);
        if (comparison < 0) {
            System.out.println("wins the car " + auto2);
        } else if (comparison > 0) {
            System.out.println("wins the car " + auto1);
        } else {
            System.out.println("no one won...");
        }

        System.out.println("--------------------");
        List<Auto> autos = Arrays.asList(auto1, auto2, auto3, auto4, auto5);
        System.out.println("sort by mileage:");
        autos.sort(autoComparator);
        for (Auto a : autos) {
            System.out.print(a);
        }
        System.out.println();
    }
}

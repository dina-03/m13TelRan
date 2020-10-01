package de.telran.controller;

import de.telran.data.Flower;
import de.telran.data.Plant;
import de.telran.data.Tree;

public class PlantApp {
    public static void main(String[] args) {
        Plant tree1 = new Tree("Baobab", 0, 0);
        Plant tree2 = new Tree("Oak", 1, 100);

        Plant flower1 = new Flower("Tulip", 0, 0);
        Plant flower2 = new Flower("Rose", 1, 2);
       // tree2.growPlantForPeriodOfYears(3);
        //growPlantForPeriodOfYears(flower1, 2);
        Plant[] plants = {tree2,flower1};
        growPlantsForPeriodOfYears(plants,3);
        displayArray(plants);
    }

    private static void growPlantForPeriodOfYears(Plant plant, int years){
        for (int i = 0; i < years; i++) {
            plant.doYear();
            System.out.println("---------");
        }
    }

    private static void growPlantsForPeriodOfYears(Plant[] plants, int years){
        for (int i = 0; i < years; i++) {
            for (Plant p : plants) {
                p.doYear();
                System.out.println();
            }
        }
    }

    public static void displayArray(Object[] objects){
        for (Object o :objects) {
            System.out.println(o);
        }
    }
}

package de.telran;

import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Comparator<Human> humanComparator = new CoronaComparator();
        Human vasja = new Human(true, 20);
        Human petja = new Human(false, 120);

        int comparison = humanComparator.compare(vasja, petja);
        if (comparison < 0) {
            System.out.println("Petja will be vaccinated first");
        }else if (comparison > 0){
            System.out.println("Vasja will be vaccinated first");
        }else {
            System.out.println("No matter who will be vaccinated first");
        }
    }
}

class Human {
    boolean isMedicalPersonal;
    int age;

    public Human(boolean isMedicalPersonal, int age) {
        this.isMedicalPersonal = isMedicalPersonal;
        this.age = age;
    }
}

/**
 *
 */
class CoronaComparator implements Comparator<Human> {
    @Override
    public int compare(Human h1, Human h2) {
        if (h1.isMedicalPersonal && h2.isMedicalPersonal ||
                !h1.isMedicalPersonal && !h2.isMedicalPersonal)
            return h1.age - h2.age;
        if (h1.isMedicalPersonal)
            return 1;
        else
            return -1;
    }
}

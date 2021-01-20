package de.telran;

import java.util.ArrayList;
import java.util.Iterator;

public class Animal {
    String breed;
    int price;

    public Animal(String breed, int price) {
        this.breed = breed;
        this.price = price;
    }

    @Override
    public String toString() {
        return breed +
                ", price:" + price;
    }
}

class MainA {
    public static void main(String[] args) {
        Animal cat = new Animal("Pushok", 4000);
        Animal dog = new Animal("Sharik", 5000);
        Animal bird = new Animal("Crow", 2000);
        Animal[] c = {cat, dog, bird};
        /*for (Animal tmp : c) {
            tmp.price = tmp.price + 1000; //Возможно изменение полей объекта
        }
        for (Animal tmp : c) {
            System.out.println(tmp.breed + ": " + tmp.price);
        }*/
        ArrayList<Animal> al = new ArrayList<>();
        al.add(new Animal("Fish", 50));
        al.add(new Animal("Dog", 5000));
        al.add(new Animal("Cat", 3000));
        Iterator<Animal> carIterator = al.iterator();
        while (carIterator.hasNext()) {
            Animal tmp = carIterator.next();
            tmp.price += 1000;
        }
        System.out.println(al);
    }
}

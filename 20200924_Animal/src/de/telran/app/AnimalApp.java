package de.telran.app;

import de.telran.data.*;

public class AnimalApp {
    public static void main(String[] args) {
        Object animal2 = new Animal("Bear", "brown");
        Cat cat1 = new Cat("Cat","gold","Pushistik", "Sveta");
        System.out.println("Cat Pushistik");
        cat1.voice();
        cat1.run();
        cat1.eat();
        cat1.displayInfo("white");

        Dog dog1 = new Dog("Dog", "black","Sharik", "Vasya");
        Animal dog2 = new Dog("Dog", "grau", "Tuzik", "Petya");
        System.out.println("------------");

        WildAnimal tiger = new Tiger("tiger","white");
        WildAnimal bear = new Bear("bear", "brown", "Altai");
        Bear bear1 = new Bear("bear", "white", "North Pole");

        System.out.println();
        System.out.println("Tiger white");
        tiger.eat();
        tiger.migration("siberia");
        WildAnimal.displayVoice(tiger);
        ((Tiger)tiger).displayInfo("white");
        tiger.run();

        System.out.println();
        System.out.println("White Bear");
        bear1.displayInfo("white","North Pole");
        bear1.run();
        bear1.eat();
        System.out.println();
        System.out.println("Brown Bear");
        bear.voice();
        bear.migration("Altai");
        bear.eat();
        ((Bear)bear).displayInfo("brown","siberia");
        bear.sleep();

        System.out.println();

       /* Pet cat = new Cat("cat", "white", "Murka", "Masha");
        Pet dog3 = new Dog("dog", "grown", "Fasan", "Frida");
        System.out.println();
        cat.voice();
        System.out.println();
        dog3.voice();
        System.out.println();
      *//*  Animal animal = new Animal("Animal","white");
        animal.eat();
        ((Animal)animal2).eat();
        System.out.println();
        System.out.println(animal instanceof Dog);
        System.out.println("Dog1");
        dog1.eat();
        dog1.sleep();
        dog1.bark();
        System.out.println();
        ((Dog)animal).bark();//не сработает!!!!*//*

        Pet.displayVoice(cat);
        System.out.println();
        Pet.displayVoice(dog1);
        System.out.println();*/
       // System.out.println("Display color: ");
       // dog1.displayInfo("black");
    }
}

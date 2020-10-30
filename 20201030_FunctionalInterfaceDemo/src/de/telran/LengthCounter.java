package de.telran;

@FunctionalInterface
public interface LengthCounter {
    int count(String s);
    //String toString(); //абстрактный методи из класса Object
/*
    default void print() {
        System.out.println("hello");
    }

    static void sayGoodBey(){
        System.out.println("good bey");
    }*/
}

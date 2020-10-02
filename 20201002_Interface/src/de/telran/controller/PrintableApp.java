package de.telran.controller;

import de.telran.data.*;

public class PrintableApp {
    public static void main(String[] args) {
        Book book = new Book("The little prince", "Saint-Exupery");
        Printable book2 = new Book("War and Peace", "Lev Tolstoy");
        Printable journal = new Journal("World");
        Printable newspaper = new Newspaper();
        WaterPipe pipe = new WaterPipe();
        Printable[] printableObjects = {book, book2, journal, newspaper, pipe};

        Lamp lamp = new Lamp();
        lamp.printState(1);
        System.out.println("----");
        pipe.printState(0);
        System.out.println("----");
       /* for (Printable p : printableObjects) {
            p.print();
        }*/
        book.print2("i'm book");
        newspaper.print2("Reno");
        System.out.println("----");
        Printable print = new Printable() {
            @Override
            public void print() {
                System.out.println("i'm printer");
            }
        };

        print.print();

        System.out.println("-----");
        Printable.print1();
        System.out.println("------");
        Printable p = Printable.createObject("Peace", 1);
        p.print();
    }
}

package de.telran.data;

public interface Printable {
    void print();

    default void print2(String str){
        System.out.println(str);
    }

    static void print1(){
        System.out.println("Hello!");
    }

    static Printable createObject(String name, int choice){
        switch (choice){
            case 1: return new Book(name); //author -> null
            case 2: return new Journal(name);
            case 3: return new Newspaper(name);
            default: return null;
        }
    }
}

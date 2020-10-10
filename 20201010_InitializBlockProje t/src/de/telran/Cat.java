package de.telran;

public class Cat extends Pet {
    static {
        System.out.println("Static block in Cat");
    }

    {
        System.out.println("First block in Cat");
    }

    {
        System.out.println("Second block in Cat");
    }

    public Cat() {
        System.out.println("Cat empty constructor");
    }
    public void voice(){
        System.out.println("May");
    }
    static void sayHello(){
        System.out.println("Hello!");
    }
}

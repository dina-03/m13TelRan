package de.telran;

public class Pet {
    private String name;

    static {
        System.out.println("Static block in Pet");
    }

    {
        System.out.println("First block in Pet");
    }

    {
        System.out.println("Second block in Pet");
    }

    public Pet(){
        System.out.println("Pet empty constructor");
    }
}

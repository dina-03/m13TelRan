package de.telran.data;

public class Animal {
    protected String type;
    private String color;

    protected String getColor() {
        return color;
    }

    protected void setColor(String color) {
        this.color = color;
    }

    public Animal(String type, String color) {
        this.type = type;
        this.color = color;
    }

    public void eat() {
        System.out.println("I can eat");
    }

    public void sleep() {
        System.out.println("I can sleep");
    }

    public void run() {
        System.out.println( type + " can run");
    }

    @Override
    public String toString() {
        return "I am Animal";
    }
}

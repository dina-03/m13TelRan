package de.telran.data;

public class Trumpet implements Instruments{
    private String name;
    private int diameter = 15;

    public Trumpet(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getDiameter() {
        return diameter;
    }

    @Override
    public void play() {
        System.out.println("Play this instrument " + name + " with these characteristics:");
        System.out.println(name + " with diameter " + diameter + "cm");
    }
}

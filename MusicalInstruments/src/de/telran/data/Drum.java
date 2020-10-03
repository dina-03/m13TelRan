package de.telran.data;

public class Drum implements Instruments{
    private String name;
    private int diameter = 50;

    public Drum(String name) {
        this.name = name;
    }

    public Drum(String name, int diameter) {
        this.name = name;
        this.diameter = diameter;
    }

    public String getName() {
        return name;
    }

    public int getDiameter() {
        return diameter;
    }

    @Override
    public void play() {
        System.out.println("Play this instrument with these characteristics: ");
        System.out.println(name + " with diameter " + diameter + "cm");
    }
}

package de.telran.data;

public class Piano implements Instruments{
    private String name;
    private int keys = 88;

    public Piano(String name) {
        this.name = name;
    }
    public Piano(String name, int keys) {
        this.name = name;
        this.keys = keys;
    }

    @Override
    public void play() {
        System.out.println("Play this instrument " + name + " with these characteristics:");
        System.out.println(name + " with " + keys + " keys");
    }

    public String getName() {
        return name;
    }

    public int getKeys() {
        return keys;
    }


}

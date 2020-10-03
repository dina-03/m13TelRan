package de.telran.data;

public class Guitar implements Instruments{
    private String name;
    private int strings = 6;

    public Guitar(String name) {
        this.name = name;
    }

    public Guitar(String name, int strings) {
        this.name = name;
        this.strings = strings;
    }

    public String getName() {
        return name;
    }

    public int getStrings() {
        return strings;
    }

    @Override
    public void play() {
        System.out.println("Play this instrument with these characteristics: " + name + " with " + strings + " " +
                "strings");
    }
}

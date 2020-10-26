package de.telran.game;

public class Hockey implements Command{
    private int number = 3;

    public int getNumber() {
        return number;
    }

    @Override
    public void execute() {
        System.out.println("hockey start");
    }
}

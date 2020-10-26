package de.telran.game;

public class Football implements Command{
    private final int number = 2;

    public int getNumber() {
        return number;
    }

    @Override
    public void execute() {
        System.out.println("Football start");
    }
}

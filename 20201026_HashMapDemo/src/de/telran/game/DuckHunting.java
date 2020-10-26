package de.telran.game;

public class DuckHunting implements Command{
    private final int number = 1;

    public int getNumber() {
        return number;
    }

    @Override
    public void execute() {
        System.out.println("Hunting start");
    }
}

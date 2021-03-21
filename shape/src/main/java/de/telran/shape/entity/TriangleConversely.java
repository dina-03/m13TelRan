package de.telran.shape.entity;

public class TriangleConversely {
    private int height;
    private char symbol;

    public TriangleConversely(int height, char symbol) {
        this.height = height;
        this.symbol = symbol;
    }

    public int getHeight() {
        return height;
    }

    public char getSymbol() {
        return symbol;
    }

    @Override
    public String toString() {
        return "" + symbol;
    }
}

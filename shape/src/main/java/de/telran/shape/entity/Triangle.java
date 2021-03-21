package de.telran.shape.entity;

public class Triangle {
    private int height;
    private char symbol;

    public Triangle(int height, char symbol) {
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

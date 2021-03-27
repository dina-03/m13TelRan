package de.telran.shape.entity;

public class Line {
    private int length;
    char symbol;

    public Line(int length, char symbol) {
        this.length = length;
        this.symbol = symbol;
    }

    public int getLength() {
        return length;
    }

    public char getSymbol() {
        return symbol;
    }

    @Override
    public String toString() {
        return "" + symbol;
    }
}

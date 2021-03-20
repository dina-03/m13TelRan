package de.telran.shape.entity;

public class Rectangle{
    private int height;
    private int width;
    char symbol;

    public Rectangle(int height, int width, char symbol) {
        this.height = height;
        this.width = width;
        this.symbol = symbol;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public char getSymbol() {
        return symbol;
    }

    @Override
    public String toString() {
        return "" + symbol;
    }
}

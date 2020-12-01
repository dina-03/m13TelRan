package de.telran;

public class Rectangle extends Shape {
    private int height;
    private int width;

    public Rectangle(char symbol, int height, int width) {
        super(symbol);
        this.height = height;
        this.width = width;
    }

    @Override
    public void draw() {
        for (int j = 0; j < height; j++) {
            for (int i = 1; i < width; i++) {
                System.out.print(symbol);
            }
            System.out.println(symbol);
        }
    }
}

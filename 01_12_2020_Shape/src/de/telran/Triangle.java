package de.telran;

public class Triangle extends Shape {
    private int height;

    public Triangle(char symbol, int height) {
        super(symbol);
        this.height = height;
    }

    @Override
    public void draw() {
        char space = ' ';
        for (int i = height + 1, i2 = 0; i > 0; i2+=2, i--) {
            for (int j = 0; j < i - 1; j++) {
                System.out.print(space);
            }
            for (int j = 1; j < i2; j++) {
                System.out.print(symbol);
            }
            System.out.println();
        }
        /*int i = 0;
        while (i < height) {
            line += symbol;
            System.out.println("" + line + space);
            i++;
        }*/
    }
}

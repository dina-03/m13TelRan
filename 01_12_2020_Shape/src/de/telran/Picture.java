package de.telran;

public class Picture extends Shape {
    private Shape[] shape;

    public Picture(char symbol, Shape[] shape) {
        super(symbol);
        this.shape = shape;
    }

    @Override
    public void draw() {
        System.out.println("" + symbol + symbol + symbol);
        for (int i = 0; i < shape.length; i++) {
            shape[i].draw();
        }
        System.out.println("" + symbol + symbol + symbol);
    }
}

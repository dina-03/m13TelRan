package de.telran;

public class Picture extends Shape {
    private Shape[] shape;
    private int count;

    public Picture(char symbol, int count, Shape[] shape) {
        super(symbol);
        this.shape = shape;
        this.count = count;
    }

    @Override
    public void draw() {
        lineSymbol();
        System.out.println();
        for (Shape value : shape) {
            value.draw();
        }
        lineSymbol();
    }

    public void lineSymbol(){
        for (int i = 0; i < count; i++) {
            System.out.print(symbol);
        }
    }
}

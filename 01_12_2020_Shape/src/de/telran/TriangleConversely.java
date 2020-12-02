package de.telran;

public class TriangleConversely extends Shape {
    private int height;

    public TriangleConversely(char symbol, int height) {
        super(symbol);
        this.height = height;
    }

    @Override
    public void draw() {
        String line = "";
        String space = " ";
        for (int i = (height * 2) - 1, i2 = 0; i > 0; i2++, i -= 2) {
            for (int i = 0; i < i2; i++) {
                System.out.print(space);
            }
            for (int j = 0; j < i; j++) {
                System.out.print(symbol);
            }
            System.out.println(line);
        }
    }
}

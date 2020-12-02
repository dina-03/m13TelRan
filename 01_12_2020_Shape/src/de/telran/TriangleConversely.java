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
        for (int num = (height * 2) - 1, num2 = 0; num > 0; num2++, num -= 2) {
            for (int i = 0; i < num2; i++) {
                System.out.print(space);
            }
            for (int j = 0; j < num; j++) {
                System.out.print(symbol);
            }
            System.out.println(line);
        }
    }
}

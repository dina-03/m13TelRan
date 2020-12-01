package de.telran;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Shape rectangle1 = new Rectangle('*', 5, 10);
        Shape rectangle2 = new Rectangle('$', 3, 5);
        Shape line1 = new Line('+', 20);
        Shape line2 = new Line('-', 25);

        Shape[] shapes = {line2, rectangle1, line1, rectangle2, line1, rectangle1, line2};

        /*line1.draw();
        rectangle1.draw();
        line1.draw();*/
        Picture picture = new Picture('!', shapes);
        picture.draw();
    }
}

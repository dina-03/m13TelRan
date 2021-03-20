package de.telran.shape.service;

import de.telran.shape.entity.Line;
import de.telran.shape.entity.Rectangle;
import org.springframework.stereotype.Service;

//@Service
public class Draw {
    private Line line;
    private Line line1;
    private Line line2;
    private Rectangle rectangle;
    private Rectangle rectangle1;

    public void drawLine(Line line) {
        for (int i = 0; i < line.getLength(); i++) {
            System.out.print(line);
        }
        System.out.println();
    }

    public void drawRectangle(Rectangle rectangle) {
        for (int i = 0; i < rectangle.getHeight(); i++) {
            for (int j = 1; j < rectangle.getWidth(); j++) {
                System.out.print(rectangle);
            }
            System.out.println(rectangle);
        }
    }

    public void print(Line line, Rectangle rectangle,Line line1,Rectangle rectangle1,Line line2) {
        drawLine(line);
        drawRectangle(rectangle);
        drawLine(line1);
        drawRectangle(rectangle1);
        drawLine(line2);
    }
}

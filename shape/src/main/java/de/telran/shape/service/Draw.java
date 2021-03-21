package de.telran.shape.service;

import de.telran.shape.entity.Line;
import de.telran.shape.entity.Rectangle;
import de.telran.shape.entity.Triangle;
import de.telran.shape.entity.TriangleConversely;
import org.springframework.stereotype.Service;

//@Service
public class Draw {
    private Line line;
    private Line line1;
    private Line line2;
    private Rectangle rectangle;
    private Rectangle rectangle1;
    private Triangle triangle;

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

    public void drawTriangle(Triangle triangle) {
        char space = ' ';
        for (int i = triangle.getHeight() + 1, i2 = 0; i > 0; i2 += 2, i--) {
            for (int j = 0; j < i - 1; j++) {
                System.out.print(space);
            }
            for (int j = 1; j < i2; j++) {
                System.out.print(triangle);
            }
            System.out.println();
        }
    }

    public void drawTriangleConversely(TriangleConversely triangle1) {
        String line = "";
        String space = " ";
        for (int i = (triangle1.getHeight() * 2) - 1, i2 = 0; i > 0; i2++, i -= 2) {
            for (int j = 0; j < i2; j++) {
                System.out.print(space);
            }
            for (int j = 0; j < i; j++) {
                System.out.print(triangle1);
            }
            System.out.println(line);
        }
    }

    public void print(Line line,
                      Rectangle rectangle,
                      Line line1,
                      Rectangle rectangle1,
                      Line line2,
                      Triangle triangle,
                      TriangleConversely triangle1) {
        drawLine(line);
        drawRectangle(rectangle);
        drawLine(line1);
        drawRectangle(rectangle1);
        drawLine(line2);
        drawTriangle(triangle);
        drawTriangleConversely(triangle1);
    }
}

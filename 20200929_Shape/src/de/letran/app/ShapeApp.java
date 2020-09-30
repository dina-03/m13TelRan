package de.letran.app;

import de.letran.data.*;

public class ShapeApp {
    public static void main(String[] args) {
       /* Shape shape = new Square(Color.BLUE, 14);
        Circle circle1 = new Circle(Color.GREEN, 10);
        Square square1 = new Square(Color.GREY, 9);
        Square square2 = new Square(Color.GREY, 10);
        //((Square) square1).changeColor(Color.RED);
        Shape rectangle = new Rectangle(Color.GREEN, 14, 12);
        Triangle triangle1 = new RightTriangle(Color.RED, 5, 7);
        Rectangle rectangle1 = new Rectangle(Color.GREY, 8, 4);

        Shape[] shapes = {shape, circle1, square1, square2, triangle1, rectangle1, rectangle};*/
        Shape shape = new Circle(Color.RED, 12);
        Circle circle1 = new Circle(Color.BLACK, 10);
        Shape square = new Square(Color.GREEN, 8);

        Circle c1 = new Circle(Color.RED, 12);
        Circle c2 = new Circle(Color.GREEN, 9);

        Square sq1 = new Square(Color.YELLOW, 5);
        Square sq2 = new Square(Color.RED, 8);

        Rectangle r1 = new Rectangle(Color.BLUE, 9, 3);
        Rectangle r2 = new Rectangle(Color.YELLOW, 7, 6);

        Triangle tr1 = new RightTriangle(Color.BLACK, 6, 3);
        Shape tr2 = new EquilateralTriangle(Color.YELLOW, 7);
        Shape tr3 = new EquilateralTriangle(Color.YELLOW, 9);


        Shape[] shapes = {shape, circle1, square, c1, c2, sq1, sq2, r1, r2, tr1, tr2, tr3};
        //Shape.displayAreaFromShapesArray(shapes);
        System.out.println();
        //System.out.println(Shape.findMaxShapeByArea(shapes));
        /*printArray(Shape.getShapesByColor(shapes, Color.GREY));
        System.out.println();
        printArray(Shape.getShapesByColor(shapes, Color.GREEN));
        System.out.println();
        printArray(Shape.getShapesByColor(shapes, Color.BLUE));
        System.out.println();
        printArray(Shape.getShapesByColor(shapes, Color.YELLOW));*/
       // printArray(Shape.getShapesByShape(shapes, "Circle"));
        printArray(Shape.getShapesByShape(shapes, "square"));
    }

    public static void printArray(Object[] objects) {
        for (Object o : objects) {
            System.out.println(o);
        }
    }
}

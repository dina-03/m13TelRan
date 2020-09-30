package de.letran.data;

public class RightTriangle extends Triangle {
    private double secondSide;

    public RightTriangle(Color color, double side, double secondSide) {
        super(color, side);
        this.secondSide = secondSide;
    }

    public double getSecondSide() {
        return secondSide;
    }

    @Override
    public double getArea() {
        return (getSide() * secondSide) / 2;
    }

    @Override
    public String toString() {
        return super.toString() + "RightTriangle: " +
                ", side a: " + getSide() + ", side b: " + secondSide +
               ", " + getColor() +
                ", area: " + getArea();
    }
}

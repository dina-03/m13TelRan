package de.telran;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("opel", 2012);
        Car.Headlight headlight = car.new Headlight();
        Car.SteeringWheel steeringWheel = car.new SteeringWheel();

        car.start();
        steeringWheel.left();
        steeringWheel.right();
        car.stop();
        car.headlight.lightOn();
        car.steeringWheel.left();
    }
}

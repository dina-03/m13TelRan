package de.telran;

public class Car {
    private String model;
    private int yearOfProduction;
    Headlight headlight;
    SteeringWheel steeringWheel;

    public Car(String model, int yearOfProduction) {
        this.model = model;
        this.yearOfProduction = yearOfProduction;
        this.headlight = new Headlight();
        this.steeringWheel = new SteeringWheel();
    }

    public void start() {
        headlight.lightOn();
        System.out.println("go");
    }
    public void stop() {
        headlight.lightOff();
        System.out.println("i'm stopping");
    }

    public class SteeringWheel {
        public void right() {
            System.out.println("turn on right");
        }

        public void left() {
            System.out.println("turn on left");
        }
    }

    public class Headlight {
        public void lightOn() {
            start();
            System.out.println("headlight is on");
        }

        public void lightOff() {
            stop();
            System.out.println("headlight is off");
        }
    }

}

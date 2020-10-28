package de.telran.robot;

public class RobotApp {
    public static void main(String[] args) {
        Body body = new Body();
        SmallHead smallHead = new SmallHead();
        MediumHead mediumHead = new MediumHead();
        BigHead bigHead = new BigHead();

        Robot robot = new Robot(body, smallHead);
        ((SmallHead)robot.getHead()).say();

        Robot<SmallHead> robot1 = new Robot<>(body, smallHead);
        robot1.getHead().say();

        Robot<MediumHead> robot2 = new Robot<>(body, new MediumHead());
        robot2.getHead().looking();

        Leg leg = new Leg();
       // Robot robot3 = new Robot(body,leg);
    }
}

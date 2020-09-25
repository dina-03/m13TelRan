package de.telran.data;

public class Cat extends Pet{
    public Cat(String type, String color, String nickName, String nameOfOwner) {
        super(type, color, nickName, nameOfOwner);
    }

    @Override
    public void voice() {
        super.voice();
        System.out.println("may-may");
    }

    public void displayInfo(String color){
        super.type = "cat";
        System.out.println("call me a cat!");
        super.setColor(color);
        System.out.println("I am " + super.getColor() + " and fluffy!");
    }
}

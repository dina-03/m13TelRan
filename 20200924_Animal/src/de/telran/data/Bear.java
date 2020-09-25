package de.telran.data;

public class Bear extends WildAnimal{
    public Bear(String type, String color, String habitat) {
        super(type, color, habitat);
    }

    public void voice(){
        super.voice();
        System.out.println("rrreeerrr");
    }

    public void eat(){
        System.out.println("I like fish!");
    }

    public void displayInfo(String color, String habitat){
        super.type = "bear";
        System.out.println("I am " + type);
        super.setColor(color);
        System.out.println("I am " + super.getColor() + " " + type);
        System.out.println("I living in " + habitat);
    }
}

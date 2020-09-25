package de.telran.data;

public class Tiger extends WildAnimal{

    public Tiger(String type, String color){
        super(type, color);
    }

    @Override
    public void voice() {
        super.voice();
        System.out.println("rrr-rrr. I'm hungry!!!");
    }
    public void run(){
        System.out.println("I run faster than you all");
    }

    public void eat(){
        System.out.println("I like meat!");
    }

    public void displayInfo(String color){
        super.type = "tiger";
        System.out.println("I am " + type);
        super.setColor(color);
        System.out.println("My color is " + super.getColor());
    }
}

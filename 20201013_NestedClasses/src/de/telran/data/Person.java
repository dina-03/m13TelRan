package de.telran.data;

public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public void personIntroduction() {
        System.out.println("my name is " + name);
    }

    public void displayMessage(Message message) {
        System.out.println(message.greet());
    }
}

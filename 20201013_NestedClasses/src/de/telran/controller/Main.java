package de.telran.controller;

import de.telran.data.Message;
import de.telran.data.Person;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Vasya");
        person.personIntroduction();
        Person person1 = new Person("Katya") {

            @Override
            public void personIntroduction() { //анонимный класс
                super.personIntroduction();
                System.out.println("i'm 30 years old");
            }
        };
        person1.personIntroduction();
        person.displayMessage(new Message() {
            @Override
            public String greet() {
                return "Hello!";
            }
        });
    }
}

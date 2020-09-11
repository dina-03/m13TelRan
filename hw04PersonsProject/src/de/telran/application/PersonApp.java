package de.telran.application;

import de.telran.data.Person;

public class PersonApp {
    public static void main(String[] args) {
        Person person1 = new Person("Vasya", 25);
        person1.setName("Vasiliy");
        Person person2 = new Person("Alex", 24);
        Person person3 = new Person("Katya", 18);
        Person person4 = new Person("Masha", 23);
        Person person5 = new Person("Anastasiya", 19);

        Person[] group = {person1, person2, person3, person4, person5};

        Person.displayPersons(group);
        Person.displayOldestPerson(group);
        Person.displayYoungestPerson(group);
        Person.displayLongestNamePerson(group);
    }
}

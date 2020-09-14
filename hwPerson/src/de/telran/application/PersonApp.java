package de.telran.application;

import de.telran.data.Person;

public class PersonApp {
    public static void main(String[] args) {
        Person person1 = new Person("Vasya", 30, 1.72);
        person1.setName("Vasiliy");
        Person person2 = new Person("Alex", 44, 1.68);
        Person person3 = new Person("Katya", 18, 1.23);
        Person person4 = new Person("Masha", 23, 1.61);
        Person person5 = new Person("Anastasiya", 19, 1.65);
        Person person6 = new Person("Igor", 65, 1.31);

        Person[] group = {person1, person2, person3, person4, person5, person6};

        Person.displayPersons(group);
        split();
        Person.displayOldestPerson(group);
        Person.displayLongestNamePerson(group);
        Person.displaySmallestPerson(group);
        split();
        System.out.println("sort by growth:");
        Person.sortPersonByGrowth(group);
        Person.displayPersons(group);
        split();
        System.out.println("sort by age:");
        Person.sortPersonByAge(group);
        Person.displayPersons(group);
        split();
        System.out.println("sort by Name: ");
        Person.sortPersonByName(group);
        Person.displayPersons(group);

    }

    public static void split() {
        System.out.println("--------");
    }
}

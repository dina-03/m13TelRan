package de.telran.application;

import de.telran.data.Person;

public class PersonApp {
    public static void main(String[] args) {
        Person person1 = new Person("Vasya", 25);
        person1.setName("Vasiliy");
        Person person2 = new Person("Alex", 44);
        Person person3 = new Person("Katya", 18);
        Person person4 = new Person("Masha", 23);
        Person person5 = new Person("Anastasiya", 19);

        Person[] group = {person1, person2, person3, person4, person5};
        Person.displayPersons(group);
        System.out.println("-------");
        int[] age = {person1.getAge(), person2.getAge(), person3.getAge(), person4.getAge()};
        int maxAge = Person.calculateAge(age);
        int[] nameLength = {person1.getName().length(), person2.getName().length(), person3.getName().length(),
                person4.getName().length(), person5.getName().length()};
        int longestName = Person.calculateLongestName(nameLength);
        System.out.println("oldest " + Person.findOldestPerson(group, maxAge));
        System.out.println("length " + Person.findLongestName(group, longestName));
        System.out.println("---------");
        Person.displayOldestPerson(group);
        Person.displayYoungestPerson(group);
        Person.displayLongestNamePerson(group);
    }
}

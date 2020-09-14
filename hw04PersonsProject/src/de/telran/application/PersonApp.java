package de.telran.application;

import de.telran.data.Person;

public class PersonApp {
    public static void main(String[] args) {
        Person person1 = new Person("Vasya", 30, 1.70);
        person1.setName("Vasiliy");
        Person person2 = new Person("Alex", 44, 1.68);
        Person person3 = new Person("Katya", 18, 1.55);
        Person person4 = new Person("Masha", 23, 1.60);
        Person person5 = new Person("Anastasiya", 19, 1.65);
        Person person6 = new Person("Katya", 18, 1.55);
        //System.out.println(person3.equals(person6));
        /*Person person1 = new Person("Jakob", 15);
        Person person2 = new Person("Jan", 3);
        Person person3 = new Person("Ekaterina", 10);
        Person person4 = new Person("Olya", 4);
        Person person5 = new Person("Petya", 7);*/
        Person[] group = {person1, person2, person3, person4, person5, person6};
        Person.displayPersons(group);
        split();
        System.out.println("The oldest of the group " + Person.getOldestPerson(group));
        System.out.println("The longest name in the" + Person.getLongestNamePerson(group));
       /* split();
        Person.sortPersonByAge(group);
        Person.displayPersons(group);
        split();
        Person.sortPersonByAge2(group);
        Person.displayPersons(group);
        split();
        Person.sortPersonByName(group);
        Person.displayPersons(group);
        split();
        Person.sortPersonByGrowth(group);
        Person.displayPersons(group);*/

        /*System.out.println("-------");
        System.out.println("Решение Марии");
        int[] age = {person1.getAge(), person2.getAge(), person3.getAge(), person4.getAge()};
        int maxAge = Person.calculateAge(age);
        int[] nameLength = {person1.getName().length(), person2.getName().length(), person3.getName().length(),
                person4.getName().length(), person5.getName().length()};
        int longestName = Person.calculateLongestName(nameLength);
        System.out.println("oldest " + Person.findOldestPerson(group, maxAge));
        System.out.println("length " + Person.findLongestName(group, longestName));
        System.out.println("---------");
        System.out.println("Решение Жени");
        Person.displayOldestPerson(group);
        Person.displayYoungestPerson(group);
        Person.displayLongestNamePerson(group);*/
    }

    public static void split() {
        System.out.println("-----------");
    }
}

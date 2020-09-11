package de.telran.data;

import java.util.Arrays;
import java.util.Comparator;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0 && age < 110)
            this.age = age;
        else
            System.out.println("wrong age");
    }

    @Override
    public String toString() {
        return "\"Person Name\": " + name +
                ", age: " + age +
                ';';
    }

    public static void displayPersons(Person[] persons) {
        for (Person p : persons) {
            System.out.println(p);
        }
    }

    public static Person getOldestPerson(Person[] persons) {
        return Arrays.stream(persons).max(Comparator.comparing(Person::getAge)).get();
    }

    public static void displayOldestPerson(Person[] persons) {
        System.out.println("The oldest of the group " + Person.getOldestPerson(persons));
    }

    public static Person getYoungestPerson(Person[] persons){
        return Arrays.stream(persons).min(Comparator.comparing(Person::getAge)).get();
    }

    public static void displayYoungestPerson(Person[] persons){
        System.out.println("The youngest of the group " + Arrays.stream(persons).min(Comparator.comparing(person -> person.age)).get());
    }

    public static void displayLongestNamePerson(Person[] persons){
        System.out.println("The longest name in the " + Arrays.stream(persons).max(Comparator.comparing(person -> person.name.length())).get());
    }
}

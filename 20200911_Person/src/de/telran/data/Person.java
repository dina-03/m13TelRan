package de.telran.data;

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
        return "Name: " + name +
                ", age: " + age;
    }

    public static void displayPersons(Person[] persons) {
        for (Person p : persons) {
            System.out.println(p);
        }
    }

    public static Person getOldestPerson(Person[] persons) {
        return null;
    }

    public static void displayOldestPerson(Person[] persons) {

    }


}

package de.telran.data;

import java.util.Objects;

public class Person {
    private String name;
    private int age;
    private double growth;

    public Person(String name, int age, double growth) {
        this.name = name;
        this.age = age;
        this.growth = growth;
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
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Person person = (Person) o;
        return age == person.age &&
                name.equals(person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "\"Person Name\": " + name +
                ", age: " + age +
                ", growth: " + growth +
                ';';
    }

    public static void displayPersons(Person[] persons) {
        for (Person p : persons) {
            System.out.println(p);
        }
    }

    public static Person getOldestPerson(Person[] persons) {
        Person oldestPerson = persons[0];
        for (int i = 0; i < persons.length; i++) {
            if (persons[i].age > oldestPerson.age) {
                oldestPerson = persons[i];
            }
        }
        return oldestPerson;
    }

    public static Person getLongestNamePerson(Person[] persons) {
        Person longestName = persons[0];
        for (int i = 0; i < persons.length; i++) {
            if (persons[i].name.length() > longestName.name.length()){
               longestName = persons[i];
            }
        }
        return longestName;
    }

    private static int comparePersonByAge(Person p1, Person p2) {
        if (p1.age > p2.age) {
            return 1;
        } else if (p1.age < p2.age)
            return -1;
        return 0;
    }

    public static void sortPersonByAge(Person[] persons) {
        for (int i = 0; i < persons.length - 1; i++) {
            for (int j = 0; j < (persons.length - 1) - i; j++) {
                if (comparePersonByAge(persons[j], persons[j + 1]) < 0) {
                    Person temp = persons[j + 1];
                    persons[j + 1] = persons[j];
                    persons[j] = temp;
                }
            }
        }
    }

    private int compareToPersonByAge(Person person) {
        if (this.age > person.age)
            return 1;
        else if (this.age < person.age)
            return -1;
        return 0;
    }

    private double compareToPersonByGrowth(Person persons) {
        if (this.growth > persons.growth)
            return 1;
        else if (this.growth < persons.growth)
            return -1;
        return 0;
    }

    public static void sortPersonByGrowth(Person[] persons){
        for (int i = 0; i < persons.length - 1; i++) {
            for (int j = 0; j < (persons.length - 1) - i; j++) {
                if (persons[j].compareToPersonByGrowth(persons[j + 1]) > 0){
                    Person temp = persons[j + 1];
                    persons[j + 1] = persons[j];
                    persons[j] = temp;
                }
            }
        }
    }

    public static void sortPersonByAge2(Person[] persons) {
        for (int i = 0; i < persons.length - 1; i++) {
            for (int j = 0; j < (persons.length - 1) - i; j++) {
                if (persons[j].compareToPersonByAge(persons[j + 1]) > 0) {
                    Person temp = persons[j + 1];
                    persons[j + 1] = persons[j];
                    persons[j] = temp;
                }
            }
        }
    }

    public static void sortPersonByName(Person[] persons) {
        for (int i = 0; i < persons.length - 1; i++) {
            for (int j = 0; j < (persons.length - 1) - i; j++) {
                if (persons[j].name.compareTo(persons[j + 1].name) > 0) {
                    Person temp = persons[j + 1];
                    persons[j + 1] = persons[j];
                    persons[j] = temp;
                }
            }
        }

    }


/*
    public static Person findOldestPerson(Person[] group, int maxAge) {
        Person p = group[0];
        for (Person person : group) {
            if (person.getAge() == maxAge)
                p = person;
            break;
        }
        return p;
    }

    public static int calculateAge(int[] age) {
        int max = age[0];
        for (int a : age) {
            max = Math.max(max, a);
        }
        return max;
    }

    public static Person findLongestName(Person[] group, int longestName) {
        Person n = group[0];
        for (Person person : group) {
            if (person.getName().length() == longestName)
                n = person;
            break;
        }
        return n;
    }

    public static int calculateLongestName(int[] name) {
        int max = name[0];
        for (int n : name) {
            max = Math.max(max, n);
        }
        return max;
    }

    public static Person getOldestPerson(Person[] persons) {
        return Arrays.stream(persons).max(Comparator.comparing(Person::getAge)).get();
    }

    public static void displayOldestPerson(Person[] persons) {
        System.out.println("The oldest of the group " + Person.getOldestPerson(persons));
    }

    *//*public static Person getYoungestPerson(Person[] persons) {
        return Arrays.stream(persons).min(Comparator.comparing(Person::getAge)).get();
    }*//*

    public static void displayYoungestPerson(Person[] persons) {
        System.out.println("The youngest of the group " + Arrays.stream(persons).min(Comparator.comparing(person ->
                person.age)).get());
    }

    public static void displayLongestNamePerson(Person[] persons) {
        System.out.println("The longest name in the " + Arrays.stream(persons).max(Comparator.comparing(person ->
                person.name.length())).get());
    }*/

}

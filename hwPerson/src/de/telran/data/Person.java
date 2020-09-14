package de.telran.data;

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
        this.age = age;
    }

    public double getGrowth() {
        return growth;
    }

    public void setGrowth(double growth) {
        this.growth = growth;
    }

    @Override
    public String toString() {
        return "name: " + name +
                ", age: " + age +
                ", growth: " + growth;
    }

    public static void displayPersons(Person[] persons) {
        for (Person p : persons) {
            System.out.println(p);
        }
    }

    public static Person getSmallestPerson(Person[] persons) {
        Person smallestPerson = persons[0];
        for (int i = 0; i < persons.length; i++) {
            if (persons[i].growth < smallestPerson.growth) {
                smallestPerson = persons[i];
            }
        }
        return smallestPerson;
    }

    public static void displaySmallestPerson(Person[] persons) {
        System.out.println("The smallest of the group " + getSmallestPerson(persons));
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

    public static void displayOldestPerson(Person[] persons) {
        System.out.println("The oldest of the group " + getOldestPerson(persons));
    }

    public static Person getLongestNamePerson(Person[] persons) {
        Person longestName = persons[0];
        for (int i = 0; i < persons.length; i++) {
            if (persons[i].name.length() > longestName.name.length()) {
                longestName = persons[i];
            }
        }
        return longestName;
    }

    public static void displayLongestNamePerson(Person[] persons) {
        System.out.println("The longest Persons name in the " + getLongestNamePerson(persons));
    }

    private double compareToPersonByGrowth(Person persons) {
        if (this.growth > persons.growth)
            return 1;
        else if (this.growth < persons.growth)
            return -1;
        return 0.0;
    }

    public static void sortPersonByGrowth(Person[] persons) {
        for (int i = 0; i < persons.length - 1; i++) {
            for (int j = 0; j < (persons.length - 1) - i; j++) {
                if (persons[j].compareToPersonByGrowth(persons[j + 1]) > 0) {
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

    public static void sortPersonByAge(Person[] persons) {
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

}

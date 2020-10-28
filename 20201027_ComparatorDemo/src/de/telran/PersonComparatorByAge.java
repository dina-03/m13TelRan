package de.telran;

import java.util.Comparator;

public class PersonComparatorByAge implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        return ((Integer) o1.getAge()).compareTo(o2.getAge());
    }
}

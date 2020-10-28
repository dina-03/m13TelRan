package de.telran;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> listNumber = new ArrayList<>(Arrays.asList(5, 7, 8, 1, 3, 4));
        System.out.println(listNumber);
        Collections.sort(listNumber);
        System.out.println(listNumber);

       /* int num = 5;
        Integer number = num;*/ //авто упаковка

        Person p1 = new Person("Vasya", 28);
        Person p2 = new Person("Petya", 35);
        Person p3 = new Person("Augusta", 55);
        List<Person> persons = new ArrayList<>(Arrays.asList(p1, p2, p3, new Person("Olya", 25),
                new Person("Vasya", 15)));
        /*Collections.sort(persons);
        System.out.println(persons);*/

        persons.sort(new PersonComparatorByAge());
        System.out.println(persons);
        Collections.sort(persons,new PersonComparatorByNameAndAge());
        System.out.println(persons);
    }
}

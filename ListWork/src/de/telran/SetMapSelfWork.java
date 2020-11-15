package de.telran;

import javax.swing.text.View;
import java.util.*;

public class SetMapSelfWork {
    public static void main(String[] args) {
        convertListToSet();
        onClick();
        //получение первого элемента Set
        Set<String> str = new HashSet<>();
        str.add("1");
        str.add("2");
        str.add("3");
        str.add("4");
        str.add("5");
        System.out.println(str.iterator().next()); //1
        System.out.println(str.stream().findFirst().get());//1
        System.out.println(str);
        System.out.println("---------");
        System.out.println("List example:");
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("1");
        list.add("5");
        for (String s : list) {
            System.out.print(s + " ");
        }
        System.out.println();
        System.out.println("Set example:");
        Set<String> set = new HashSet<>();
        set.add("1");
        set.add("2");
        set.add("2");
        set.add("3");
        set.add("4");
        set.add("1");
        set.add("5");
        for (String s : set) {
            System.out.print(s + " ");
        }
    }

    public static void convertListToSet() {
        List<Integer> sourceList = Arrays.asList(0, 1, 2, 3, 4, 5, 5, 4);
        Set<Integer> targetSet = new HashSet<>(sourceList);
        System.out.println(targetSet);
    }

    public static void onClick() {
        //создаем множество стран
        HashSet<String> countryHashSet = new HashSet<>();
        countryHashSet.add("Russia");
        countryHashSet.add("France");
        countryHashSet.add("Honduras");
        countryHashSet.add("Belgium");
        //получим размер HashSet
        System.out.println(countryHashSet);
        System.out.println("Размер HashSet = " + countryHashSet.size());
    }
}

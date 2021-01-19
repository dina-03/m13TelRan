package de.telran;

import java.awt.*;
import java.util.*;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        //Создаем массив типа String
        String[] people = new String[]{"Eva", "Anna", "Katja", "Sasha", "Petr", "Nata"};
        //Создаем HashMap, <Key, Value>
        HashMap<String, Human> map = addHumanToMap(people);

        //Используется метод интерфейса Map.Entry<Key, Value>, пробегаем по map
        for (Map.Entry<String, Human> pair : map.entrySet()) {
            System.out.println(pair.getKey() + " - " + pair.getValue());
        }
    }

    private static HashMap<String, Human> addHumanToMap(String[] people) {
        HashMap<String, Human> allHuman = new HashMap<>();
        for (String s : people) {
            allHuman.put(s, new Human(s));
        }
        return allHuman;
    }

    public static class Human {
        private String name;

        public Human(String name) {
            this.name = name;
        }

        //Переопределяем метод toString класса Object
        @Override
        public String toString() {
            return name != null ? name.toUpperCase() : null;
        }
    }
}

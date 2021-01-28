package de.telran;

import java.util.*;

public class Auto {
    private String make;
    private String color;

    public Auto(String make, String color) {
        this.make = make;
        this.color = color;
    }

    public Auto(List<Auto> list) {
    }

    public String getMake() {
        return make;
    }

    public String getColor() {
        return color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Auto auto = (Auto) o;
        return Objects.equals(make, auto.make) && Objects.equals(color, auto.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(make, color);
    }

    @Override
    public String toString() {
        return "make: " + make + ", color: " + color;
    }

    //Есть лист объектов класса Auto (make, color). Вернуть Map, ключами которого являются марки автомобилей,
    // а значениями являются списки автомобилей этой марки
    public HashMap<String, List<Auto>> groupAutosByMake(List<Auto> autos) {

        HashMap<String, List<Auto>> autosGroup = new HashMap<>();
        HashSet<String> key = new HashSet<>();

        for (Auto auto : autos) {
            key.add(auto.make);
        }

        for (String s : key) {
            List<Auto> v = new ArrayList<>();
            for (Auto auto : autos) {
                if (s.equals(auto.make)) {
                    v.add(auto);
                }
            }
            autosGroup.put(s, v);
        }
        return autosGroup;
    }
}

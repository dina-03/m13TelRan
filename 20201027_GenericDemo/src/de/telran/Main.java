package de.telran;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        List list1 = new ArrayList();
        list1.add("Hello");
        list1.add(12);
        String str = (String)list1.get(0);
    }
}

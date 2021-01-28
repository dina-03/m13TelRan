package de.telran;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 1, 2, 1);
        for (Integer integer : list) {
            System.out.print(integer + " ");
        }
        System.out.println();
        Exercises<Integer> list2 = new Exercises<>();
        System.out.println(list2.getSetListInteger(list));
    }

    //Auto
    Auto mazda = new Auto("mazda", "black");
    Auto audi = new Auto("audi", "yellow");
    Auto volkswagen = new Auto("volkswagen", "grey");
    Auto[] group = {mazda, audi, volkswagen};
    HashMap<String, List<Auto>> hashMap = new HashMap<>();

}

package de.telran;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import  java.util.Random;

public class ListRandomRule implements RandomRule {

    // private int[] values;
    List<Integer> values;
    Random random = new Random();

   public ListRandomRule(List<Integer> numbers) {
        values = new ArrayList<>(numbers);
    }

    public ListRandomRule(int[] numbers) {
        values = new ArrayList<>();
        for (int number:numbers) {
            values.add(number);
        }
    }

    @Override
    public int nexInt() {
        return (int) values.get(random.nextInt(values.size()));
    }
}

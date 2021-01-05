package de.telran;

import java.util.ArrayDeque;

public class StackMax {
    private final ArrayDeque<Integer> source;
    private final ArrayDeque<Integer> currentMax;

    public StackMax() {
        source = new ArrayDeque<>();
        currentMax = new ArrayDeque<>();
    }

    public void addLast(int elt) {
        if (source.size() == 0 || elt > currentMax.getLast())
            currentMax.addLast(elt);
        else
            currentMax.addLast(currentMax.getLast());
        source.addLast(elt);
    }

    public int getLast() {
        return source.getLast();
    }

    public int removeLast() {
        currentMax.removeLast();
        return source.removeLast();
    }

    public int size() {
        return source.size();
    }

    public int getMax() {
        //foreach here over all the elements of the source - перечислять здесь все элементы первоисточника
       /*
        int max = source.getFirst();
        for (Integer num : source) {
            // max = max < num ? num : max;
            max = Math.max(max, num);
        }*/

        return currentMax.getLast();
    }
}

package de.telran;

import java.util.Comparator;

public class MileageComparator implements Comparator<Auto> {
    @Override
    public int compare(Auto o1, Auto o2) {
        return o1.getMileage() - o2.getMileage();
    }
}

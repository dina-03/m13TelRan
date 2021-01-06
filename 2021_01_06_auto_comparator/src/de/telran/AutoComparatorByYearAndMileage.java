package de.telran;

import java.util.Comparator;

public class AutoComparatorByYearAndMileage implements Comparator<Auto> {
    @Override
    public int compare(Auto o1, Auto o2) {
        int res = Integer.compare(o1.getMileage(), o2.getMileage());
        if (res == 0) {
            res = Integer.compare(o1.getYear(), o2.getYear());
        }
        return res;
    }
}

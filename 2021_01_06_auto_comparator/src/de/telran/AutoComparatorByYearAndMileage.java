package de.telran;

import java.util.Comparator;

public class AutoComparatorByYearAndMileage implements Comparator<Auto> {
    @Override
    public int compare(Auto o1, Auto o2) {
        // int res = Integer.compare(o1.getMileage(), o2.getMileage());
        int res = o2.getMileage() - o1.getMileage();
        /*if (res == 0) {
            res = Integer.compare(o1.getYear(), o2.getYear());
        }*/
        if (res != 0)
            return res;
        return o1.getYear() - o2.getYear();
    }
}

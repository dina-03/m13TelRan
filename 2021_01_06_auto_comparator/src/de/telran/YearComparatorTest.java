package de.telran;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class YearComparatorTest {
    MileageComparator mileageComparator = new MileageComparator();

    @Test
    public void testCompare_autoWithSameMillage_zero() {
        Auto auto1 = new Auto("Audi", 2020, 1000);
        Auto auto2 = new Auto("BMW", 2018, 1000);
        assertEquals(0, mileageComparator.compare(auto2, auto1));
        assertEquals(0, mileageComparator.compare(auto1, auto2));
    }

    @Test
    public void testCompare_autoWithDifferentMillage_nonEqual() {
        Auto auto1 = new Auto("Audi", 2020, 1000);
        Auto auto2 = new Auto("BMW", 2018, 2000);
        assertTrue(mileageComparator.compare(auto1, auto2) < 0);
        assertTrue(mileageComparator.compare(auto2, auto1) > 0);
    }

    @Test
    public void testSortExample() {
        Auto auto1 = new Auto("Audi", 2010, 5000);
        Auto auto2 = new Auto("BMW", 2018, 1000);
        Auto auto3 = new Auto("Jeep Grand", 2020, 1500);
        Auto auto4 = new Auto("Mercedes-Benz", 2019, 100);
        Auto auto5 = new Auto("Volkswagen", 2010, 1700);

        List<Auto> autos = Arrays.asList(auto1, auto2, auto3, auto4, auto5);

        autos.sort(mileageComparator);
        System.out.println(autos.toString());
    }

}
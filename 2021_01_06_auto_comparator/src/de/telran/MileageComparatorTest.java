package de.telran;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MileageComparatorTest {
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
        assertTrue( mileageComparator.compare(auto1, auto2) < 0);
        assertTrue( mileageComparator.compare(auto2, auto1) > 0);
    }
}
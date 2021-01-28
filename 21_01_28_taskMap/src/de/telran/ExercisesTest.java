package de.telran;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ExercisesTest {
    Exercises<Integer> list = new Exercises<>();
    List<Integer> integerList = new ArrayList<>();

    @Test
    public void test_getSetListInteger_repeated() {
        Collections.addAll(integerList, 3, 6, 10, 3, 6, 15);
        HashSet<Integer> exp = new HashSet();
        Collections.addAll(exp, 3, 6, 10, 15);
        assertEquals(exp, list.getSetListInteger(integerList));
    }

    @Test
    public void test_getSetListInteger_repeatedAll() {
        Collections.addAll(integerList, 3, 3, 3, 3);
        HashSet<Integer> exp = new HashSet();
        Collections.addAll(exp, 3);
        assertEquals(exp, list.getSetListInteger(integerList));
    }
}
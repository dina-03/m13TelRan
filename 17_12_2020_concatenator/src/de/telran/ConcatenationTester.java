package de.telran;

import java.util.Arrays;

public class ConcatenationTester {
    private final IConcatenator concatenator;

    public ConcatenationTester(IConcatenator concatenator) {
        this.concatenator = concatenator;
    }

    public void test(int times, String text) {
        String[] arrayConcatenate = composeArray(times, text);
        long beforeTest = System.currentTimeMillis();
        concatenator.concatenate(arrayConcatenate);
        long afterTest = System.currentTimeMillis();
        System.out.println(afterTest - beforeTest);
    }

    private String[] composeArray(int times, String text) {

        String[] strings = new String[times];
        Arrays.fill(strings, text);
       /* for (int i = 0; i < times; i++) {
            strings[i] = text;
        }*/
        return strings;
    }
}

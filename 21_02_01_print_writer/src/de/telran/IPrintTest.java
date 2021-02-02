package de.telran;

import java.io.IOException;
import java.util.List;

public class IPrintTest {
    private IPrint concatenator;

    public IPrintTest(IPrint concatenator) {
        this.concatenator = concatenator;
    }

    public void test(int time, List<String> strings, String filename) throws IOException {

        long beforeTest = System.currentTimeMillis();
        concatenator.concatenate(strings, filename);
        long afterTest = System.currentTimeMillis();
        System.out.println(afterTest - beforeTest);
    }
}

package de.telran;

import java.util.Random;

public class RangeRandomRule implements RandomRule{

    private int max;
    private Random random = new Random();

    public RangeRandomRule(int max) {
        this.max = max;
    }

    @Override
    public int nexInt() {
        return random.nextInt(max);
    }
}

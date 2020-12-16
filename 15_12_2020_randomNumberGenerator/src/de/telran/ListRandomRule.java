package de.telran;

public class ListRandomRule<Integer> implements RandomRule{

    private int[] values;

    public ListRandomRule(int[] values) {
        this.values = values;
    }

    public ListRandomRule(ListRandomRule<Integer> values) {
    }

    @Override
    public int nexInt() {
        return 0;
    }
}

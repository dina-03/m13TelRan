package de.telran;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {5, -10, 7};
        RandomRule rule = new ListRandomRule(numbers);
        RandomGenerator generator = new RandomGenerator(rule);
        System.out.println(generator.nextInts(10));

        //rang random rule
        generator = new RandomGenerator(new RangeRandomRule(3));
        System.out.println(generator.nextInts(10));
    }
}

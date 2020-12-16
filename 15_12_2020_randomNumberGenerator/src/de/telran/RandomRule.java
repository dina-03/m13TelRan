package de.telran;

/**
 * The interface provides the single method nextInt which should provide random int numbers
 * according to a concrete implementation
 * @param <Integer>
 */

public interface RandomRule<Integer> {
    int nexInt();
}

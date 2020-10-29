package de.telran;

@FunctionalInterface
public interface WordsChecker {
    boolean checkWord(String word);
    //default void print(String word){};
    //String toString();
}

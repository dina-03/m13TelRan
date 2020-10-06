package de.telran.data;

public class ToStarCase implements WordsChecker{
    @Override
    public boolean checkWord(String word) {
        return word.length() == 2;
    }

    @Override
    public String transformWord(String word) {
        return word.replaceAll(".", "*");
    }
}

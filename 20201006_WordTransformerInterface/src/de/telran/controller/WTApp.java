package de.telran.controller;

import de.telran.data.ToLowerCase;
import de.telran.data.ToStarCase;
import de.telran.data.ToUpperCase;
import de.telran.data.WordsTransformer;

public class WTApp {
    public static void main(String[] args) {
        WordsTransformer wt = new WordsTransformer();
        String str = "aa RTZDG jjj DgDt";
        System.out.println(wt.transform(str, new ToLowerCase()));
        System.out.println(wt.transform(str, new ToUpperCase()));
        System.out.println(wt.transform(str, new ToStarCase()));
    }
}

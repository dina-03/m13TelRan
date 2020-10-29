package de.telran;

public class WordsTransform {
    public static String transformWord(String input, WordsChecker checker, WordTransformer transformer) {
        String[] words = input.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (checker.checkWord(words[i])) {
                words[i] = transformer.transformWord(words[i]);
            }
        }
        return String.join(" ", words);
    }
}

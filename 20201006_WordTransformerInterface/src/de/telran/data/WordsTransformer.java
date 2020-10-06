package de.telran.data;

public class WordsTransformer {
    public String transform(String input, WordsChecker wc) {
        String[] words = input.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (wc.checkWord(words[i]))
                words[i] = wc.transformWord(words[i]);
        }
        return String.join(" ", words);
    }
}

package de.telran;

public class WordTransformerApp {
    public static void main(String[] args) {
        WordsChecker wc = new WordsChecker() {
            @Override
            public boolean checkWord(String word) {
                return word.length() == 4;
            }
        };

        WordsChecker wordsChecker = s -> s.length() == 5;
        WordTransformer wordTransformer = new WordTransformer() {
            @Override
            public String transformWord(String word) {
                return word.toUpperCase();
            }
        };

        WordTransformer wt = s -> s.replaceAll(".", "*");

        WordTransformer wt2 = WordTransformerApp::transformWord;


        System.out.println(wc.checkWord("hello"));
        System.out.println(wordsChecker.checkWord("hello"));

        String str = "aa Frkj dfhs KJUGO";
        System.out.println(WordsTransform.transformWord(str, wc, wordTransformer));
        System.out.println(WordsTransform.transformWord(str, s -> s.length() == 2, String::toUpperCase));
    }

    private static String transformWord(String s) {
        return s.toUpperCase();
    }
}

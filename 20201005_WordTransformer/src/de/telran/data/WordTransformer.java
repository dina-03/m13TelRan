package de.telran.data;

public class WordTransformer {

    //aghJ kLU jgkslg ttt -> aghJ KLU jgkslg TTT
    public String wordTransform(String input) {
        String[] strings = input.split(" ");
        for (int i = 0; i < strings.length; i++) {
            if (strings[i].length() == 3) {
                strings[i] = strings[i].toUpperCase();
                // System.out.println(s);
            }
        }
        return String.join(" ", strings);
    }

    public String wordTransformTwo(String input, int action) {
        String[] strings = input.split(" ");
        for (int i = 0; i < strings.length; i++) {
            if (action == 1) {
                if (strings[i].length() == 3) {
                    strings[i] = strings[i].toUpperCase();
                } else if (action == 2) {
                    if (strings[i].length() == 4) {
                        strings[i] = strings[i].toLowerCase();
                    }
                }
            }
        }
        return String.join(" ", strings);
    }

    public String wordTransformTree(String input, TransformerRuleLength3 tr) {
        String[] strings = input.split(" ");
        for (int i = 0; i < strings.length; i++) {
            if (tr.check(strings[i])) {
                strings[i] = tr.action(strings[i]);
            }
        }
        return String.join(" ", strings);
    }
}

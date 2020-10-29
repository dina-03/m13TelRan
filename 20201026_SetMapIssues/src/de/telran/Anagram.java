package de.telran;

import java.util.*;

public class Anagram {
    private String[] voc;
    private Map<String, List<String>> map;

    public Anagram(String[] voc) {
        this.voc = voc;
        map = new HashMap<>();
    }
    //{“anna”, “ivan”, “naan”, “vani”, “piotr”, “nana”, “navi”}

    public Map<String, List<String>> getMap() {
        return map;
    }

    //ivan ->
    private static String sortWord(String word) {
        char[] chars = word.toCharArray();
        Arrays.sort(chars);
        return Arrays.toString(chars);
    }

    public void createMap() {
        for (String s : voc) {
            String key = sortWord(s);
            if (!map.containsKey(key)) {
                List<String> anagrams = new ArrayList<>();
                anagrams.add(s);
                map.put(key, anagrams);
            } else {
                List<String> anagramsLink = map.get(key); //ссылка присваивается к anagrams из if
                anagramsLink.add(s);
            }
        }
    }

    public List<String> getAnagrams(String word) {
        String key = sortWord(word);
        return map.get(key);
    }
}

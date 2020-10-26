package de.telran;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("world", "hello", "vasya", "world", "dog"));
        System.out.println(countWordRepeat(list,"cat"));

        Map<String, Integer> map = wordCount(list);
        System.out.println(getWordsCount(map,"world"));
        System.out.println(map);
    }

    public static int countWordRepeat(List<String> list, String word) {
        int count = 0;
        for (String str : list) {
            if (str.equals(word)) {
                count++;
            }
        }
        return count;
    }

    public static Map<String, Integer> wordCount(List<String> stringList) {
        Map<String, Integer> map = new HashMap<>();
        for (String s : stringList) {
            if (!map.containsKey(s)) {
                map.put(s, 1);
            } else {
                map.put(s, map.get(s) + 1);
            }
        }
        return map;
    }

    public static int getWordsCount(Map<String, Integer> map, String word) {
        if (!map.containsKey(word)) {
            return 0;
        }
        return map.get(word);
    }
}

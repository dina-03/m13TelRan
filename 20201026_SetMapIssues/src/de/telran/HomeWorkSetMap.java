package de.telran;

import java.util.*;

public class HomeWorkSetMap {
    public static void main(String[] args) {
        System.out.println(removeDuplicate(Arrays.asList(1, 2, 3, 3, 4, 5, 4, 7, 8, 5)));
        System.out.println(removeDuplicate(Arrays.asList("a", "b", "c", "a", "d", "b")));
        System.out.println(getDuplicate(Arrays.asList(1, 2, 3, 3, 4, 5, 4, 7, 8, 5)));
        System.out.println("_______________");
        String[] strings = {"a", "a", "b", "c", "c", "a", "f"};
        System.out.println(wordMultiple(strings));
        System.out.println(wordMultiple1(strings));
        System.out.println("_______________");
        String[] strings1 = {"anna", "ivan", "naan", "vani", "piotr", "nana", "navi"};
        Anagram anagram = new Anagram(strings1);
        anagram.createMap();
        System.out.println(anagram.getMap());
        List<String> ivan = anagram.getAnagrams("anna");
        System.out.println(ivan);
    }

    private static <E> List<E> removeDuplicate(List<E> list) {
        Set<E> set = new HashSet<>(list);
        return new ArrayList<>(set);
    }

    private static <E> List<E> getDuplicate(List<E> list) {
        Set<E> set = new HashSet<>();
        List<E> duplicate = new ArrayList<>();
        for (E i : list) {
            if (!set.add(i)) {
                duplicate.add(i);
            }
        }
        return duplicate;
    }

    private static Map<String, String> getNewMapWithNewKey(Map<String, String> map, String a, String b) {
        Map<String, String> newMap = new HashMap<>(map);
        if (newMap.containsKey(a) && newMap.containsKey(b)) {
            newMap.put((a + b), newMap.get(a) + newMap.get(b));
        }
        return newMap;
    }

    private static Map<String, Boolean> wordMultiple(String[] strings) { //a,a,c,d,d, -> a:true  c:false  d:true
        Map<String, Boolean> map = new HashMap<>();
        for (String s : strings) {
            map.put(s, map.containsKey(s));
        }
        return map;
    }

    private static Map<String, Boolean> wordMultiple1(String[] strings) {
        Map<String, Boolean> map = new HashMap<>();
        int count;
        List<String> list = Arrays.asList(strings);
        for (String s : strings) {
            count = Collections.frequency(list, s);
            map.put(s, count > 1);
        }
        return map;
    }
}

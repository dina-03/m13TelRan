package de.telran;

import java.awt.*;
import java.util.*;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        /*Map<String, Integer> map = new HashMap<>();
        map.put("key1", 1);
        map.put("key2", 22);
        map.put("key3", 333);
        map.put("key4", 4444);
        Integer keyMap = map.get("key1");
        Integer keyS = map.get("key2");
        System.out.println(keyMap + " " + keyS);
        // map.remove("key2");

        Set<String> stringSet = map.keySet();
        for (String s : stringSet) {
            System.out.println(s);
        }

        for (Integer k : map.values()) {
            System.out.println(k);
        }

        System.out.println(map.containsKey("key2"));*/

        System.out.println(removeDuplicate(Arrays.asList("a", "b", "b", "c", "d")));
        System.out.println(removeDuplicate(Arrays.asList(2, 3, 6, 6, 8)));
        System.out.println(getDuplicate(Arrays.asList("a", "b", "b", "c", "d")));
    }

    private static <E> List<E> removeDuplicate(List<E> list) {
        Set<E> set = new HashSet<>(list);
        return new ArrayList<>(set);
    }

    private static <E> List<E> getDuplicate(List<E> list) {
        Set<E> set = new HashSet<E>();
        List<E> duplicateString = new ArrayList<E>();
        for (E s : list) {
            if (!set.add(s)) {
                duplicateString.add(s);
            }
        }
        return duplicateString;
    }
}

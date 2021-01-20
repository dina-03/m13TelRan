package de.telran;

import java.util.HashMap;
import java.util.Map;

public class SimpleMap {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("World", 100);
        System.out.println(map.size());
        map.put("World1", 150);
        map.put("World2", 250);
        map.put("World3", 350);
        map.put("World4", 450);
        System.out.println(map.size());
       // System.out.println(map);

        for (Map.Entry<String, Integer> tmp : map.entrySet()) {
            System.out.println(tmp.getKey() + " " + tmp.getValue());
        }
    }
}

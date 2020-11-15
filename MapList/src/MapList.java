import java.util.*;

public class MapList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("string1");
        list.get(0);
        list.remove(0);
        for (String s : list) {
            System.out.println(s);
        }

        List list1 = new ArrayList<>();
        list1.add("string1");
        list1.add(12);
        for (Object o : list1) {
            System.out.print(o +  " ");
        }
        System.out.println();
        Map<String, Integer> map = new HashMap<>(); // <ключ, значение> - ключ уникален, значение могут повторятся
        map.put("key", 2);
        map.put("key1", 7);
        map.put("key2", 8);
        map.put("key3", 10);
        Integer k = map.get("key2");
       // System.out.println(k);
       // map.remove("key1");

        /*Set<String> strings = map.keySet();
        for (String s : strings) {
            System.out.println(s);
        }*/
        for (Integer ki : map.values()) {
            System.out.print(ki + " ");
        }

       // System.out.println(map.containsKey("key2"));
    }
}

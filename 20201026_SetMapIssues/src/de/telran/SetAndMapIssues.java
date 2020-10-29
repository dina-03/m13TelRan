package de.telran;

import java.util.*;

public class SetAndMapIssues {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 3, 4, 5, 6, 4));
        System.out.println(removeDuplicates(numbers));
        System.out.println(getDuplicates(numbers));
        System.out.println("--------------------------");
        Map<String, String> map = new HashMap<>();
        map.put("a", "Hi");
        map.put("b", "There");
        Map<String, String> map1 = new HashMap<>();
        map1.put("a", "Hi");
        Map<String, String> map2 = new HashMap<>();
        map2.put("b", "There");
        System.out.println(mapAB(map));
        System.out.println(mapAB(map1));
        System.out.println(mapAB(map2));
        System.out.println("--------------------------");
        System.out.println(wordMultiple(new String[]{"a", "b", "a", "c", "b"}));
        System.out.println(wordMultiple(new String[]{"c", "b", "a"}));
        System.out.println(wordMultiple(new String[]{"c", "c", "c", "c"}));
        System.out.println("--------------------------");
        Set<String> dictionary = new HashSet<>();
        Collections.addAll(dictionary, "anna", "ivan", "naan", "vani", "piotr", "navi");
        System.out.println(getAnagram(dictionary, "ivan"));
        System.out.println(getAnagram(dictionary, "anna"));
        System.out.println(getAnagram(dictionary, "piotr"));
    }

    //С использованием множеств (Set) реализовать функцию, которая вернет список без повторяющихся элементов:
    //List<Integer> removeDuplicates(List<Integer> input)
    //Пример:{1,2,3,3,4,5,6,4} -> {1,2,3,4,5,6}
    public static List<Integer> removeDuplicates(List<Integer> input) {
        Set<Integer> numbers = new HashSet<>();
        numbers.addAll(input);
        List<Integer> output = new ArrayList<>();
        output.addAll(numbers);
        return output;
    }

    //С использованием множеств реализовать функцию, которая вернет повторяющиеся элементы из данного списка:
    //List<Integer> getDuplicates(List<Integer> input)
    //Пример: {1,2,3,3,4,5,6,4} -> {3,4}
    public static List<Integer> getDuplicates(List<Integer> input) {
        List<Integer> duplicate = new ArrayList<>();
        duplicate.addAll(input);
        List<Integer> set = removeDuplicates(duplicate);
        for (Integer i : set) {
            duplicate.remove(i);
        }
        return duplicate;
    }

    //Дана Map<String, String> map, написать функцию, которая вернет Мап, такую, если в исходной map есть ключ ‘a’ и
    // ‘b’, то нужно создать новый ключ ‘ab’ с суммой значений от ключей a и b.
    //Примеры:
    //mapAB({“a”: “Hi”, “b”: “There”}) -> {“a”: “Hi”, “ab”: “HiThere”, “b”: “There”} mapAB({“a”: “Hi”}) -> {“a”: “Hi”}
    //mapAB({“b”: “There”}) -> {“b”: “There”}
    public static Map<String, String> mapAB(Map<String, String> map) {
        if (map.size() > 1) {
            List<String> keySet = new ArrayList<>();
            keySet.addAll(map.keySet());
            List<String> values = new ArrayList<>();
            values.addAll(map.values());
            String newKey = keySet.get(0) + keySet.get(1);
            String newValue = values.get(0) + values.get(1);
            /*for (int i = 0; i < map.size(); i++) {
                newKey += keySet.get(i);
                newValue += values.get(i);
            }*/
            map.put(newKey, newValue);
        }
        return map;
    }

    //Дан массив строк, вернуть мапу Map<String, Boolean>, где каждая строка является ключем, а значением true, если
    // строка в массиве больше одного раза и false, если только один раз.
    //Примеры:
    //wordMultiple([“a”, “b”, “a”, “c”, “b”]) -> {“a”: true, “b”: true, “c”: false} wordMultiple([“c”, “b”, “a”]) ->
    // {“a”: false, “b”: false, “c”: false} wordMultiple([“c”, “c”, “c”, “c”]) ->{“c”: true}
    public static Map<String, Boolean> wordMultiple(String[] strings) {
        Map<String, Boolean> map = new HashMap<>();
        for (String s : strings) {
            map.put(s, map.containsKey(s));
        }
        return map;
    }

    //Анаграмма слова x - слово, по длине равное x и состоящее из таких же букв,что и x.
    // Например, слово “vani” является анаграммой слова “ivan”, а слова“naan” и “anan” являются анаграммами слова “anna”.
    // Дан словарь, содержащий анаграммы, например {“anna”, “ivan”, “naan”, “vani”, “piotr”, “nana”, “navi”}.
    // Написать функцию, которая по слову из словаря вернет все анаграммы этого слова, которые есть в словаре.
    // Например, по слову “ivan” функция вернет{“navi”, “vani”}
    public static Map<String, Set<String>> getAnagram(Set<String> glossary, String word){
        Map<String, Set<String>> map = new HashMap<>();
        Set<String> output = new HashSet<>();
        for (String s : glossary) {
            if (isAnagram(s, word) && !s.equals(word)){
                output.add(s);
                map.put(word, output);
            }
        }
        return map;
    }

    private static boolean isAnagram(String firstWord, String secondWord) {
        char[] word1 = firstWord.replaceAll("[\\s]", "").toCharArray();
        char[] word2 = secondWord.replaceAll("[\\s]", "").toCharArray();
        Arrays.sort(word1);
        Arrays.sort(word2);
        return Arrays.equals(word1, word2);
    }
}

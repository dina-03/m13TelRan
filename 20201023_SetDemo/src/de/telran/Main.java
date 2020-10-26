package de.telran;

import java.util.*;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        Collections.addAll(stringList, "Vasya", "Petya", "Masha", "Vasya", "Olya", "Petya", "Kostya");
        /*Iterator iterator = stringList.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }*/
      /*  System.out.println(stringList);
        for (String s : stringList) {
            System.out.println(s);
        }
        uniqueString(stringList);
        Set<Integer> set = createSet(20);
        System.out.println(set);
        System.out.println(removeNumbersGreat10(set));*/
        Set<Integer> num = createSetTwo(5);
        /*revers(5,1).forEach(System.out::print);*/
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println(list);
        System.out.println(revers(list));
       /* System.out.println(list);
        list.stream().sorted(Collections.reverseOrder()).forEach(System.out::print);*/


    }

    private static Set<String> uniqueString(Collection<String> collections) {
        Set<String> result = new HashSet<>(collections);
        System.out.println("unique elements: " + result.size());
        return result;
    }

    private static HashSet<Integer> createSet(int size) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < size; i++) { //while (set.size < size)
            set.add((int) (Math.random() * 30));
        }
        return set;
    }

    private static HashSet<Integer> createSetTwo(int size) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < size; i++) { //while (set.size < size)
            set.add(size);
        }
        return set;
    }

    private static Set<Integer> removeNumbersGreat10(Set<Integer> set) {
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
            if (iterator.next() > 10) {
                iterator.remove();
            }
        }
        return set;
    }

    public static List<Integer> revers(List<Integer> list){
         Collections.reverse(list);
        return list;
    }
}

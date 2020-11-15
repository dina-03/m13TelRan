package de.telran;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SetA {
    public static void main(String[] args) {
        System.out.println(removeDuplicates(Arrays.asList(1, 2, 1, 3, 2, 4, 5, 6, 1)));
        System.out.println(removeDuplicates(Arrays.asList("a", "a", "b", "c", "c", "d", "d")));
        System.out.println("-------");
        List<Integer> stream = Arrays.asList(5, 2, 3, 45, 13, 2, 55, 4, 13);
        System.out.println(getDuplicatesElements(stream));
    }

    public static <E> List<E> removeDuplicates(List<E> input) {
        Set<E> set = new HashSet<>(input);
        return new ArrayList<>(set);
    }

    public static <E> List<E> getDuplicatesElements(List<E> list) {
        Set<E> set = new HashSet<>();
        return list.stream().filter(n -> !set.add(n)).collect(Collectors.toList());
    }
}

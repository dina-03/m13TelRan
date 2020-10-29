package de.telran;

import java.util.function.Function;
import java.util.function.Predicate;

public class TransformWithFunctionalInterface {
    public static void main(String[] args) {
        String str = "aa Frkj dfh KJUGO";
        Predicate<String> lengthIsThree = string -> string.length() == 3;
        Predicate<Integer> moreThanTen = integer -> integer > 10;
        Predicate<Person> oldestThenTen = person -> person.getAge() > 10;

        System.out.println(moreThanTen.test(8));
        System.out.println(lengthIsThree.test("bob"));
        System.out.println(oldestThenTen.test(new Person("Vanya", 15)));

        Function<String, String> f = s -> s.replaceAll(".", "*");
        Function<String, String> f2 = String::toUpperCase;
        Function<String, String> f3 = String::toLowerCase;
        System.out.println(transform(str, s -> s.length() % 2 == 0, String::toUpperCase));
    }

    public static String transform(String input, Predicate<String> p, Function<String, String> f) {
        String[] words = input.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (p.test(words[i])) {
                words[i] = f.apply(words[i]);
            }
        }
        return String.join(" ", words);
    }
}

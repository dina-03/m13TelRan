package de.telran;

import java.util.*;
import java.util.function.*;

public class Main {

    public static void main(String[] args) {

        Function<Integer, Integer> sum = (x) -> x;
        int c1 = 12;
        System.out.println(sum.apply(c1));

        Function<Double, Double> sqrt = Math::sqrt;
        System.out.println(sqrt.apply(9.0));// возвращает 3

        Function<Double, Double> sqrt1 = (Double x) -> Math.sqrt(x);

        Supplier<String> generator = String::new; // () -> String

        String hello = "hello";
        Function<String, String> helloF = (name) -> hello + name;

        System.out.println(helloF.apply(hello));
        // Predicate
        Consumer<String> print = System.out::println;
        print.accept("Hello world!");

        IntPredicate isEven = x -> x % 2 == 0;  // callback - передача функциональности в метод в качестве аргумента
        System.out.println(isEven.test(8));//true


        IntPredicate dividedBy3 = (x) -> x % 3 == 0;
        IntPredicate res = isEven.negate().or(dividedBy3);
        System.out.println(res.test(10)); // false
        System.out.println(res.test(12)); // true
        System.out.println("--------------------------");

        /*IntSupplier supplier = () -> (int) Math.sin(30);
        System.out.println(supplier.getAsInt());*/

        IntSupplier intSupplier = () -> 3;

        Consumer<String> str = System.out::println;

        BiPredicate<Integer, Integer> biPredicate = (x, y) -> x % 5 == 0;

        DoubleUnaryOperator operator1 = Math::sin;

        Function<Double, String> ds = (x) -> String.valueOf(x * x);

        //Math::sin; -
        //() -> 3; -
        //(x) -> String.valueOf(x*x); -
        //System.out::println; -
        //(x, x) -> x % 5 == 0;

        List<String> stringList = Arrays.asList("boob", "food", "meet", "food", "flood", "meet");
        Function<List<String>, List<String>> lambda =
                (list) -> new ArrayList<>(new HashSet<>(list));
        System.out.println(lambda.apply(stringList));

        int a = 2;
        int b = 3;
        int c = 5;

        Function<Integer, Integer> f = (x) -> a * x * x + b * x + c;
        System.out.println(f.apply(10));

        DoubleUnaryOperator operator = (x) -> x * x;
        System.out.println(operator.applyAsDouble(5.0));
        System.out.println(operator.applyAsDouble(15.5));
    }
}

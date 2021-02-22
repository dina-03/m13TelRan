package de.telran;

import java.util.function.Predicate;
import java.util.List;

public class PredicateService {

    public Predicate<Double> intersect(List<Predicate<Double>> predicates) {
        Predicate<Double> res = (Double x) -> true;
        for (Predicate<Double> predicate : predicates) {
            res = res.and(predicate); // predicate1 & predicate2 & ....& predicateN
        }
        return res;
    }
}

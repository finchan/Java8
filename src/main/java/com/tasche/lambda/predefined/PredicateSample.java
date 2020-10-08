package com.tasche.lambda.predefined;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

//@FunctionalInterface
//public interface Predicate<T> {
//    boolean test(T t);
//}

public class PredicateSample {
    public static <T> List<T> filter(List<T> list, Predicate<T> p) {
        List<T> results = new ArrayList();
        for (T t: list) {
            if(p.test(t)) {
                results.add(t);
            }
        }
        return results;
    }

    public static void main(String[] args) {
        Predicate<String> nonEmptyStringPredicate = (String s) ->!s.isEmpty();
        List<String> strings = Arrays.asList("1", "2", "", "3");
        List<String> nonEmpty = filter(strings, nonEmptyStringPredicate);
        System.out.println(nonEmpty);
    }
}

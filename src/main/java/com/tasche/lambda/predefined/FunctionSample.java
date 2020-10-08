package com.tasche.lambda.predefined;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

//@FunctionalInterface
//public interface Function<T, R> {
//    R apply(T t);
//}
public class FunctionSample {
    public static void main(String[] args) {
        List<Integer> l = map(Arrays.asList("Lambda", "in", "action"),
                (String s) -> s.length());
        System.out.println(l);
    }
    public static <T,R> List<R> map(List<T> list, Function<T,R> f) {
        List<R> result = new ArrayList<>();
        for(T t: list) {
            result.add(f.apply(t));
        }
        return result;
    }
}

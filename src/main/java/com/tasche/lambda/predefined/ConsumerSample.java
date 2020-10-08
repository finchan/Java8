package com.tasche.lambda.predefined;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

//@FunctionalInterface
//public interface Consumer<T> {
//    void accept(T t);
//}

public class ConsumerSample {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("1", "2", "3");
        forEach(strings, (String s) -> {
            System.out.println(s);
            s = s+" index";
            System.out.println(s);
        });
    }

    public static <T> void forEach(List<T> list, Consumer<T> c) {
        for(T t: list) {
            c.accept(t);
        }
    }
}

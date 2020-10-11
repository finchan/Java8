package com.tasche.lambda.methodreference;

import com.tasche.parameterization.predicate.Apple;

import java.util.*;
import java.util.function.Function;

public class ConstructorReference {
    public static List<Apple> map (List<Integer> list, Function<Integer, Apple> f) {
        List<Apple> result = new ArrayList<>();
        for(Integer e: list) {
            result.add(f.apply(e));
        }
        return result;
    }

    static Map<String, Function<String, Fruit>> map = new HashMap<>();
    static {
        map.put("orange", Orange::new);
        map.put("pineApple", PineApple::new);
    }
    public static Fruit giveMeFruit(String fruit, String fruitName) {
        return map.get(fruit.toLowerCase())
                .apply(fruitName);
    }

    public static void main(String[] args) {
        List<Integer> weights = Arrays.asList(7, 3, 4, 10);
        List<Apple> apples = map(weights, Apple::new);
        System.out.println(apples);
        //////////////////////////////////////////////////
        Fruit fruit = giveMeFruit("orange", "OrangeName");
        System.out.println(fruit.getName());
    }
}
